package com.learning.designpatterns.StrategyPattern;

public class PaymentGateway {
    private PaymentStrategy paymentStrategy;

    public PaymentGateway(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
