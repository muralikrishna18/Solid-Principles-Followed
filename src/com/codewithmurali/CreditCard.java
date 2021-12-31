package com.codewithmurali;

public class CreditCard implements PaymentType{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done via credit card");

    }
}
