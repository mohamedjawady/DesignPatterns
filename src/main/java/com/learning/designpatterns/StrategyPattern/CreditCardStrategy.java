package com.learning.designpatterns.StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
