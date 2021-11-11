package me.mirotic.designpattern.creation.builder.example;


import java.util.stream.Stream;


public class StreamEx {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .build();
        int sum = integerStream.mapToInt(Integer::intValue).sum();

        System.out.println(sum);


        Stream<String> stringStream = Stream.<String>builder()
                .add("aaa")
                .add("---")
                .add("zzz")
                .build();

        stringStream.forEach(System.out::println);
    }
}
