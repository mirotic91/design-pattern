package me.mirotic.designpattern.structure.facade.example;

import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SpringEx {

    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();
        mailSender.send();
    }
}
