package main.java.design.strategy;

public class Percentdiscount implements Discountstrategy {
    public double getdiscount(double price) {
        return 0.8*price;
    }
}
