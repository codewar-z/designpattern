public class UberDriver implements Observer {

    public UberDriver() { }

    @Override
    public void update(String name) {
        System.out.println("UBER: \n passenger "+ name + " is trying to book a cab\n");
    }
}
