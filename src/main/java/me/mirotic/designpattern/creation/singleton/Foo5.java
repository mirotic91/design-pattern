package me.mirotic.designpattern.creation.singleton;

import java.io.Serializable;

/**
 * static inner 클래스를 이용하여 메서드를 호출시 클래스가 로딩되어 lazy-initialization
 **/
public class Foo5 implements Serializable { // 역직렬화 테스트용

    private Foo5() {}


    public static Foo5 getInstance() {
        return Holder.INSTANCE;
    }


    private static class Holder {
        private static final Foo5 INSTANCE = new Foo5();
    }


    protected Object readResolve() { // 역직렬화시 새로운 객체로 생성되는 것을 방지
        return getInstance();
    }
}
