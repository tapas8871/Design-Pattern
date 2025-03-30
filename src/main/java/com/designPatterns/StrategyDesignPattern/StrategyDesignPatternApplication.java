package com.designPatterns.StrategyDesignPattern;

import PaymentStrategy.CreditCardStrategy;
import PaymentStrategy.PaymentStrategy;
import PaymentStrategy.PayPalStrategy;
import PaymentStrategy.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyDesignPatternApplication.class, args);

        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy  creditCardStrategy = new CreditCardStrategy("1234 5676 9876","654");
        cart.setPaymentStrategy(creditCardStrategy);
        cart.checkout(100);

    PaymentStrategy payPalStrategy = new PayPalStrategy("example@gmail.com","Password@123");
    cart.setPaymentStrategy(payPalStrategy);
    cart.checkout(200);



    }





}
