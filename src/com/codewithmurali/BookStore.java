package com.codewithmurali;

public class BookStore {
    public static void main(String[] args) {

        Book book = new Book("Sapiens","Yuval Naoh Harari",2014,123,"iso1992-564");
        Invoice invoice = new Invoice(book,2,5,18);
        new PrintInvoice(invoice).printInvoice();
        InvoicePersistence invoicePersistence = new DataBasePersistence(invoice);
        invoicePersistence.saveInvoice();
        BuyBook buyBook = new BuyBook(new CreditCard(),book.price);
        WhatsApp whatsApp = new WhatsApp(book);
        whatsApp.shareToContact();
        book.mobi();
        EVersion e = book;
        e.getPdf();
        e.mobi();
        e.epub();






    }
}
