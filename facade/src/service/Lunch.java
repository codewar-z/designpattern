package service;

public class Lunch implements Service {
    private double price;
    public Lunch(int price) {
        this.price = price;
    }

    public double serve() {
        return this.price;
    }
}
