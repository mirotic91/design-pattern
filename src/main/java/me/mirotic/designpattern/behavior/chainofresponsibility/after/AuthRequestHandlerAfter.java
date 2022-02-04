package me.mirotic.designpattern.behavior.chainofresponsibility.after;

public class AuthRequestHandlerAfter extends RequestHandlerAfter {

    public AuthRequestHandlerAfter(RequestHandlerAfter requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle() {
        System.out.println("check authentication");
        super.handle();
    }
}
