package person;

import chatroom.ChatRoom;

public abstract class Person {
    protected ChatRoom room;
    protected String name;

    public Person(ChatRoom room, String name) {
        this.room = room;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    public String getName() {
        return this.name;
    }
}
