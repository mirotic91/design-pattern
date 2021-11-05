package me.mirotic.designpattern.creation.singleton;

/**
 * eager-initialization 을 이용하여 미리 생성
 **/
public class Foo4 {

    private static final Foo4 INSTANCE = new Foo4(); // 사용되지 않을 수 있음에도 미리 생성하는 비용이 발생함

    private Foo4() {}


    public static Foo4 getInstance() {
        return INSTANCE;
    }
}
