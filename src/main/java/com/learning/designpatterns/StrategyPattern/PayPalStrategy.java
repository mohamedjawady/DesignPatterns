package com.learning.designpatterns.StrategyPattern;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}