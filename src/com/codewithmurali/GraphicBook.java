package com.codewithmurali;

public class GraphicBook extends Book implements GetDigitalGraphic{

    GraphicBook book;
    public GraphicBook(String name, String authorName, int year, int price, String isbn) {
        super(name, authorName, year, price, isbn);
    }


    @Override
    public Book getDigitalGraphic() {
        return book;
    }
}
