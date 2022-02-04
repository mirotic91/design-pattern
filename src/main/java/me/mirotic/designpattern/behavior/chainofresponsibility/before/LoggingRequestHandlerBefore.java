package me.mirotic.designpattern.behavior.chainofresponsibility.before;

public class LoggingRequestHandlerBefore extends RequestHandlerBefore {

    @Override
    public void handle() {
        System.out.println("logging..");
        super.handle();
    }
}
