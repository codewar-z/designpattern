package service;

public class RoomCleaning implements Service {
    private double price;
    public RoomCleaning(int price) {
        this.price = price;
    }

    public double serve() {
        return this.price;
    }
}
