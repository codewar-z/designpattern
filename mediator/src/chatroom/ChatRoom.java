package chatroom;

import person.Person;

public interface ChatRoom {
    void join(Person user);

    void leave(Person user);

    void sendMessage(String msg, Person user);
}
