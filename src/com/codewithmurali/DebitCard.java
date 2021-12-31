package com.codewithmurali;

public class DebitCard implements PaymentType{
    @Override
    public void pay(int amount) {

        System.out.println("Payment done via Debit card");
    }
}
