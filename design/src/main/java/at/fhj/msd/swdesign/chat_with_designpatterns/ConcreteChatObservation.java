package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatObservation implements Observation {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer o : observers) {
            o.update(message.toString());
        }
    }
}