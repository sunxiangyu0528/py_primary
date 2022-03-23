package com.lemon.testcases;

import org.apache.log4j.Logger;

public class Log4jTest {
    //创建Log4j对象
    static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        logger.info("hello world");
        logger.warn("lemon");
        logger.error("lemontest");
        System.out.println("hello world");
    }
}
