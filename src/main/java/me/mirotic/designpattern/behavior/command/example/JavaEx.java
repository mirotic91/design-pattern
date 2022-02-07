package me.mirotic.designpattern.behavior.command.example;


import me.mirotic.designpattern.behavior.command.before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaEx {

    public static void main(String[] args) {
        Light light = new Light();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(light::on);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
