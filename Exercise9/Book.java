package org.Exercise9;

public class Book extends Product{
    private String author;

    public Book(){}

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    // take getDiscount as overriding and make it return value based on it's Discount
    @Override
    public double getDiscount() {
        return (getPrice()-(getPrice() * (10/100.0)));
    }

}
