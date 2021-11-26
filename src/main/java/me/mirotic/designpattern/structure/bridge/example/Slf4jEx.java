package me.mirotic.designpattern.structure.bridge.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jEx {

    private static Logger logger = LoggerFactory.getLogger(Slf4jEx.class);

    public static void main(String[] args) {
        logger.info("logging");
    }
}
