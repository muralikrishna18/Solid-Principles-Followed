package com.codewithmurali;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;

    private double taxRate;

    private double total;
    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.price*100 - book.price * discountRate)/100 * this.quantity);

        double priceWithTaxes = price * (1 + taxRate/100);

        return priceWithTaxes;
    }






    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }
}


