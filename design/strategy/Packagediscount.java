package main.java.design.strategy;

public class Packagediscount implements Discountstrategy {
    public double getdiscount(double price) {
        if(price>5000)
            return price-500;
        else
            return price;
    }
}
