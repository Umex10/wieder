package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;

import java.util.ArrayList;

public class ChatRoomSingleton {

    private static ChatRoomSingleton instance;
    private ArrayList<Message> messages;
    private ConcreteChatObservation observation;

    private ChatRoomSingleton() {
        this.messages = new ArrayList<>();
        this.observation = new ConcreteChatObservation();
    }

    public void addMessage(Message message) {
        System.out.println(message);
        this.messages.add(message);
        observation.notifyObservers(message);
    }

    public void printChat() {
        for (Message m : messages) {
            System.out.println(m);
        }
    }

    public static ChatRoomSingleton getInstance() {
        if (instance == null) {
            instance = new ChatRoomSingleton();
        }
        return instance;
    }

    public void requestUpdates(User alice) {
        observation.attach(alice);
    }
}
