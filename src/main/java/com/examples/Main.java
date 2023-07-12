package com.examples;

import com.examples.config.AppConfig;
import com.examples.knights.Knight;
import com.examples.services.KnightService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        KnightService knightService = (KnightService) context.getBean("knightService");
        knightService.sendKnight();
    }
}