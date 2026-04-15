package org.Exercise9;

public class Movie extends Product{
    private String director;

    public Movie(){}

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // take getDiscount as overriding and make it return value based on it's Discount
    @Override
    public double getDiscount() {
        return (getPrice()-(getPrice() * (20/100.0)));
    }
}
