public class OlaDriver implements Observer {

    public OlaDriver() { }

    @Override
    public void update(String name) {
        System.out.println("OLA: \n passenger "+ name + " is trying to book a cab\n");
    }
}
