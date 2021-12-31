package com.codewithmurali;

public class BuyBook {
    PaymentType paymentType;
    BuyBook(PaymentType paymentType,int amount){
        this.paymentType = paymentType;
        paymentType.pay(amount);
    }
}
