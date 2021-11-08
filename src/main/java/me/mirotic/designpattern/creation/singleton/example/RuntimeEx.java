package me.mirotic.designpattern.creation.singleton.example;


public class RuntimeEx {

    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime1 == runtime2);
    }
}
