package travel;

public class Car implements Strategy {
    @Override
    public void getToAirport() {
        System.out.println("Going to airport in a Car");
    }
}