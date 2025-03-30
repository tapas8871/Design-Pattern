package com.designPatterns.StrategyDesignPattern;

import PaymentStrategy.CreditCardStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyDesignPatternApplication.class, args);
    }


}
