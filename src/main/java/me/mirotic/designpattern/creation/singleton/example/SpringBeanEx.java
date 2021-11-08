package me.mirotic.designpattern.creation.singleton.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class SpringBeanEx {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello1 = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);
        System.out.println(hello1 == hello2);
    }


    @Configuration
    public static class SpringConfig {

        @Bean
        public String hello() {
            return "hello";
        }
    }

}
