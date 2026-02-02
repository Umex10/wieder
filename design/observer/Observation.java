package design.observer;

import java.util.List;

public interface Observation {

    public void attach(Observer observer);
    public void notifyObservers(int coldness);

}
