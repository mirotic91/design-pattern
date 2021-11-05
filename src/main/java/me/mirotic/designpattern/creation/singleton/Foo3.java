package me.mirotic.designpattern.creation.singleton;

/**
 * double-checked locking 을 이용하여 효율적으로 동기화 블럭 생성
 **/
public class Foo3 {

    private static volatile Foo3 instance; // CPU Cache -> Main Memory 저장. 비용은 더 발생함

    private Foo3() {}


    public static Foo3 getInstance() {
        if (instance == null) {
            synchronized (Foo3.class) {  // 인스턴스가 생성되기 전에만 동기화에 대한 비용이 발생함
                if (instance == null) {
                    instance = new Foo3();
                }
            }
        }

        return instance;
    }
}
