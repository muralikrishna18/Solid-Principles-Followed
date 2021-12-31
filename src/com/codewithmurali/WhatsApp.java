package com.codewithmurali;

public class WhatsApp implements ToContact, ToFriends {

    Book b;

    WhatsApp(Book b){
        this.b= b;
    }
    @Override
    public void shareToContact() {
        System.out.println("sharing the book  "+b.name + "to contact");

    }

    @Override
    public void shareAsStory() {
        System.out.println("sharing the book  "+b.name + "to status");

    }
}
