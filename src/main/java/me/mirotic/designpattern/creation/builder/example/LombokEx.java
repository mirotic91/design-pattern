package me.mirotic.designpattern.creation.builder.example;


import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;


public class LombokEx {

    public static void main(String[] args) {
        Member member = Member.builder()
                .name("ESR")
                .birthday(LocalDate.of(2000, 3, 3))
                .build();

        System.out.println(member);
    }


    @Builder
    @ToString
    private static class Member {

        private String name;

        private LocalDate birthday;
    }

}
