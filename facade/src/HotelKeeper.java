import service.*;

class HotelKeeper {
    private double Amount;
    private Service lunch;
    private Service dinner;
    private Service roomCleaning;

    HotelKeeper() {
        this.Amount = 0.0;
        this.lunch = new Lunch(10);
        this.dinner = new Dinner(15);
        this.roomCleaning = new RoomCleaning(5);
    }

    String checkOut() {
        return "Total Amount: " + this.Amount;
    }

    double requestService(Services service) {
        double price;
        switch (service) {
            case Lunch:
                price = this.lunch.serve();
                Amount += price;
                break;
            case Dinner:
                price = this.dinner.serve();
                Amount += price;
                break;
            case RoomCleaning:
                price = this.roomCleaning.serve();
                Amount += price;
                break;
            default:
                price = 0.0;
        }
        return price;
    }
}
