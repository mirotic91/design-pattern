package me.mirotic.designpattern.structure.flyweight.example;

public class JavaEx {

    public static void main(String[] args) {
        Integer cache1 = Integer.valueOf(-128);
        Integer cache2 = Integer.valueOf(-128);
        System.out.println(cache1 == cache2);
        System.out.println(cache1.equals(cache2));

        Integer no1 = Integer.valueOf(128);
        Integer no2 = Integer.valueOf(128);
        System.out.println(no1 == no2);
        System.out.println(no1.equals(no2));
    }
}
