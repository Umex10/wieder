package design.meins.factory;

public class Sea implements Factory {

  @Override
  public void createMittel() {
    return new Schiff();
  }
  
}
