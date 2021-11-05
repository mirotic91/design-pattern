package me.mirotic.designpattern.creation.singleton;

import java.io.Serializable;

/**
 * synchronized 를 사용하여 멀티 쓰레드 환경에서 안전하게 생성
 **/
public class Foo2 implements Serializable { // 역직렬화 테스트용

    private static Foo2 instance;

    private Foo2() {}


    public static synchronized Foo2 getInstance() { // 메서드 접근시 동기화에 대한 비용이 계속 발생함
        if (instance == null) {
            instance = new Foo2();
        }

        return instance;
    }
}
