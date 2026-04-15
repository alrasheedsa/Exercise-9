package org.Exercise9;

public abstract class Product {
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Set getDiscount as abstract to use it athoer classes
    public abstract double getDiscount();

    // Set getBuy1and1Free as abstract to use it another classes
    public abstract String getBuy1and1Free();

    //another method 
    public abstract double getPoints();


}
