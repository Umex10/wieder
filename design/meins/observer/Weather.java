package design.meins.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Weather implements Observable {

  private List<Observer> observers = new ArrayList<>();
  private int t;

  @Override
  public void attach() {
    observers.add(observer);
  }

  @Override
  public void remove() {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update();
    }
  }

  public void setT(int t) {
    this.t = t;
    notifyObservers(observers);
  }

}
