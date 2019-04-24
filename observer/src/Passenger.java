public class Passenger extends Subject {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void bookACab() {
        notifyObservers(name);
    }
}
