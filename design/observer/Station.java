package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private int coldness;
    private ConcreteObservervation concreteObservervation;

    public Station(int coldness) {
        this.coldness = coldness;
        this.concreteObservervation = new ConcreteObservervation();
    }

    public void addObserver(Observer observer) {
        this.concreteObservervation.attach(observer);
    }

    public void setColdness(int t) {
        this.coldness = t;
        concreteObservervation.notifyObservers(t);
    }


}
