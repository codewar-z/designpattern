import chatroom.ChatRoom;
import chatroom.QbeeChatRoom;
import org.junit.jupiter.api.Test;
import person.ChatPerson;
import person.Person;

public class ChatRoomTest {
    @Test
    void shouldAddUserAndSendMessage() {
        ChatRoom room = new QbeeChatRoom();
        Person user1 = new ChatPerson(room, "Pankaj");
        Person user2 = new ChatPerson(room, "Lisa");
        Person user3 = new ChatPerson(room, "Saurabh");
        room.join(user1);
        room.join(user2);
        room.join(user3);
        room.leave(user2);

        user1.send("Hi All");
    }
}
