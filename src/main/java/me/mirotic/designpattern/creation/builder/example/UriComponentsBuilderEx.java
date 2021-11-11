package me.mirotic.designpattern.creation.builder.example;


import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


public class UriComponentsBuilderEx {

    public static void main(String[] args) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.google.com")
                .port(80)
                .path("/design pattern")
                .build();

        System.out.println(uriComponents.toUri());
    }
}
