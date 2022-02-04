package me.mirotic.designpattern.behavior.chainofresponsibility.after;

public abstract class RequestHandlerAfter {

    private RequestHandlerAfter nextRequestHandler;

    public RequestHandlerAfter(RequestHandlerAfter nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handle() {
        if (nextRequestHandler != null) {
            nextRequestHandler.handle();
        }
    }
}
