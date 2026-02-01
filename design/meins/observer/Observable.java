package design.meins.observer;

public interface Observable {

  void attach();

  void remove();

  void notifyObservers();
  
}
