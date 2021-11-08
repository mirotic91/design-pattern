package me.mirotic.designpattern.creation.factorymethod.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class SpringBeanFactoryEx {

    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = beanFactory.getBean("hello", String.class);
        System.out.println(hello);
    }


    @Configuration
    public static class SpringConfig {

        @Bean
        public String hello() {
            return "hello";
        }
    }
}
