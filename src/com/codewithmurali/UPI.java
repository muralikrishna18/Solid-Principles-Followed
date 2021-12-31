package com.codewithmurali;

public class UPI implements PaymentType {

    @Override
    public void pay(int amount) {
        //paying via upi
        System.out.println("Payment done via UPI");
    }
}
