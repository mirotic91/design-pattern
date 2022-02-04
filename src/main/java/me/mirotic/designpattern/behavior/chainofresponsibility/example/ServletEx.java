package me.mirotic.designpattern.behavior.chainofresponsibility.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletEx {

    public static void main(String[] args) {
        SpringApplication.run(ServletEx.class, args);
    }
}
