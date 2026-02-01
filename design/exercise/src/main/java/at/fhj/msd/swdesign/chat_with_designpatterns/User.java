package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;


public class User implements Observer {

    private String name;
    private ChatRoomSingleton chatroom;


    public User(String name, ChatRoomSingleton chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "User: name='" + name;
    }


    public void postMessage(String text) {
        chatroom.addMessage(new Message(this, text));
    }

    @Override
    public void update(String message) {
        System.out.println(name + " receives " + message);
    }

}