package me.mirotic.designpattern.structure.facade;

import me.mirotic.designpattern.structure.facade.after.EmailMessage;
import me.mirotic.designpattern.structure.facade.after.EmailProperties;
import me.mirotic.designpattern.structure.facade.after.EmailSender;
import me.mirotic.designpattern.structure.facade.before.EmailSendApp;
import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    void before() {
        EmailSendApp.send();
    }

    @Test
    void after() {
        EmailProperties emailProperties = new EmailProperties("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailProperties);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("mirotic_from@mail.com");
        emailMessage.setTo("mirotic_to@mail.com");
        emailMessage.setSubject("Test Mail");
        emailMessage.setText("test");

        emailSender.send(emailMessage);
    }
}