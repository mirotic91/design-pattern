package me.mirotic.designpattern.creation.abstractfactory.example;

import me.mirotic.designpattern.creation.factorymethod.Ship;
import me.mirotic.designpattern.creation.factorymethod.after.RedShip;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class SpringFactoryBeanEx {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFactoryBeanConfig.class);
        Ship ship = applicationContext.getBean("shipExample", Ship.class);
        System.out.println(ship);
    }


    @Configuration
    public static class SpringFactoryBeanConfig {

        @Bean
        public ShipExample shipExample() {
            return new ShipExample();
        }
    }

    private static class ShipExample implements FactoryBean<Ship> {

        @Override
        public Ship getObject() {
            return new RedShip("bang");
        }

        @Override
        public Class<?> getObjectType() {
            return Ship.class;
        }
    }

}
