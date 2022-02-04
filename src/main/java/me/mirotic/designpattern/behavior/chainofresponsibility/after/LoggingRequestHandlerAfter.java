package me.mirotic.designpattern.behavior.chainofresponsibility.after;

public class LoggingRequestHandlerAfter extends RequestHandlerAfter {

    public LoggingRequestHandlerAfter(RequestHandlerAfter requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle() {
        System.out.println("logging..");
        super.handle();
    }
}
