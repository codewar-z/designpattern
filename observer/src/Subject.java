import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    void notifyObservers(String info) {
        for (Observer ob: observers)
            ob.update(info);
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
