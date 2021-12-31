package me.mirotic.designpattern.structure.proxy.example;


import me.mirotic.designpattern.structure.proxy.after.DefaultGameService;
import me.mirotic.designpattern.structure.proxy.after.GameService;

import java.lang.reflect.Proxy;

public class JavaEx {

    public static void main(String[] args) {
        dynamicProxy();
    }

    private static void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.start();
    }

    private static GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(JavaEx.class.getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("before");
                    method.invoke(target, args);
                    System.out.println("after");
                    return null;
                });
    }
}
