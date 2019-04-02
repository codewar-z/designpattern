package person;

import chatroom.ChatRoom;

public class ChatPerson extends Person {

    public ChatPerson(ChatRoom room, String name) {
        super(room, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message: " + msg);
        room.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message: " + msg);
    }

}
