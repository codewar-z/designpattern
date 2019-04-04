package chatroom;

import person.Person;

import java.util.ArrayList;
import java.util.List;

public class QbeeChatRoom implements ChatRoom {
    private List<Person> persons;

    public QbeeChatRoom() {
        this.persons = new ArrayList<>();
    }

    @Override
    public void join(Person person) {
        this.sendMessage(person.getName() + " joined ", person);
        this.persons.add(person);
    }

    @Override
    public void leave(Person person) {
        this.sendMessage(person.getName() + " left ", person);
        this.persons.remove(person);
    }

    @Override
    public void sendMessage(String msg, Person user) {
        for (Person p : this.persons) {
            if (p != user) {
                p.receive(msg);
            }
        }
    }
}
