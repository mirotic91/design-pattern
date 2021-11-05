package me.mirotic.designpattern.creation.singleton;

/**
 * static 메서드로 접근하여 private 생성자로 생성
 **/
public class Foo1 {

    private static Foo1 instance;

    private Foo1() {
    }


    public static Foo1 getInstance() {
        if (instance == null) { // 멀티 쓰레드 환경에서 여러 인스턴스가 생성될 수 있음
            instance = new Foo1();
        }

        return instance;
    }

}
