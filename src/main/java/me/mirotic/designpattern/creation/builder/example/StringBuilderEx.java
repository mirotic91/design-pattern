package me.mirotic.designpattern.creation.builder.example;


public class StringBuilderEx {

    public static void main(String[] args) {
        String str = new StringBuilder()
                .append(1)
                .append("박 ")
                .append(2)
                .append('일')
                .toString();

        System.out.println(str);
    }
}
