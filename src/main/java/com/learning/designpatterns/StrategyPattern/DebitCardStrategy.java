package com.learning.designpatterns.StrategyPattern;

public class DebitCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public DebitCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Debit Card.");
    }
}