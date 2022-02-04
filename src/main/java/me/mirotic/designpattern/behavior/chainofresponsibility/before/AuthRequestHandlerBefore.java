package me.mirotic.designpattern.behavior.chainofresponsibility.before;

public class AuthRequestHandlerBefore extends RequestHandlerBefore {

    @Override
    public void handle() {
        System.out.println("check authentication");
        super.handle();
    }
}
