package design.src.main.java.at.fhj.msd.swdesign.chat_with_designpatterns;

public interface Observation {
  
  void attach(Observer observer);

  void notifyObservers(Message message);

}
