package travel;

public class Bus implements Strategy{
    @Override
    public void getToAirport() {
        System.out.println("Going to airport in a Bus");
    }
}