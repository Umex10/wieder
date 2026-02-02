package design.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservervation implements Observation {

    private List<Observer> observers;

    public ConcreteObservervation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(int coldness) {
        for (Observer ob : observers) {
            ob.update(coldness);
        }
    }
}
