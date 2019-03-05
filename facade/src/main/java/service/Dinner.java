package service;

public class Dinner implements Service {
    private double price;
    public Dinner(int price) {
        this.price = price;
    }

    public double serve() {
        return this.price;
    }
}
