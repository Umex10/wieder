package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;

public class ChatMain {

    public static void main(String[] args) {

        ChatRoomSingleton chatRoom = ChatRoomSingleton.getInstance();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User chris = new User("Chris", chatRoom);
        User dean = new User("Dean", chatRoom);

        chatRoom.requestUpdates(alice);
        chatRoom.requestUpdates(chris);

        alice.postMessage("hi");
        bob.postMessage("Hello");
        chris.postMessage("Ciao");
        dean.postMessage("Grias di");



    }
}
