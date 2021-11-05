package me.mirotic.designpattern.creation.singleton;

/**
 * enum 을 이용하여 가장 안전하게 생성 가능
 * 리플렉션과 직렬화&역직렬화에도 안전하게 유일한 인스턴스를 생성할 수 있음
 * enum 특성상 상속을 사용 할 수 없고, lazy-initialization 할 수 없음
 **/
public enum Foo6 {

    INSTANCE;

    Foo6() {}

}
