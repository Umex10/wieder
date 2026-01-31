package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;

public class Message {

    private String messageText;
    private User user;

    public Message(User user, String msgText) {
        this.user = user;
        messageText = msgText;
    }

    public String getMessageText() {
        return messageText;
    }

    @Override
    public String toString() {
        return user.getName() + " says " + messageText;
    }
}
