package design.meins.factory;

public abstract class Factory {

  public abstract Mittel createMittel();

  public void planDelivery() {
    Mittel m = createMittel();
    m.liefere();
  }
  
}
