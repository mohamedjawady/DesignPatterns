package com.learning.designpatterns.StrategyPattern;

public class Payment {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway(new CreditCardStrategy("1234567890123456", "12/22", "123"));
        paymentGateway.pay(100);

        paymentGateway.setPaymentStrategy(new DebitCardStrategy("9876543210987654", "12/22", "456"));
        paymentGateway.pay(200);

        paymentGateway.setPaymentStrategy(new PayPalStrategy("user@example.com", "password"));
        paymentGateway.pay(300);
    }
}
