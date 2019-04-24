public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Suresh");
        Passenger p2 = new Passenger("Ramesh");

        Observer uberDriver = new UberDriver();
        Observer olaDriver = new OlaDriver();

        p1.subscribe(uberDriver);
        p1.subscribe(olaDriver);

        p2.subscribe(olaDriver);

        p1.bookACab();
        p2.bookACab();
    }
}
