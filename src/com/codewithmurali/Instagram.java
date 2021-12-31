package com.codewithmurali;

public class Instagram implements ToFriends,Social, ToContact {

    Book b;

    Instagram(Book b){
        this.b= b;
    }
    @Override
    public void shareAsStory() {
        System.out.println("sharing the book  "+b.name + "to story");

    }

    @Override
    public void shareAsPost() {
        System.out.println("posting about book "+b.name + " to Instagram");

    }

    @Override
    public void shareToContact() {
        System.out.println("sharing the book  "+b.name + "to contact");

    }
}
