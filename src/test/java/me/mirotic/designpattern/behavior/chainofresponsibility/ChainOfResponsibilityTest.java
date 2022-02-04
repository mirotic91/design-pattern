package me.mirotic.designpattern.behavior.chainofresponsibility;

import me.mirotic.designpattern.behavior.chainofresponsibility.after.AuthRequestHandlerAfter;
import me.mirotic.designpattern.behavior.chainofresponsibility.after.LoggingRequestHandlerAfter;
import me.mirotic.designpattern.behavior.chainofresponsibility.after.RequestHandlerAfter;
import me.mirotic.designpattern.behavior.chainofresponsibility.before.AuthRequestHandlerBefore;
import me.mirotic.designpattern.behavior.chainofresponsibility.before.LoggingRequestHandlerBefore;
import me.mirotic.designpattern.behavior.chainofresponsibility.before.RequestHandlerBefore;
import org.junit.jupiter.api.Test;

class ChainOfResponsibilityTest {

    @Test
    void before() {
        RequestHandlerBefore handler1 = new AuthRequestHandlerBefore();
        handler1.handle();

        RequestHandlerBefore handler2 = new LoggingRequestHandlerBefore();
        handler2.handle();
    }

    @Test
    void after() {
        RequestHandlerAfter handler = new AuthRequestHandlerAfter(new LoggingRequestHandlerAfter(null));
        handler.handle();
    }
}