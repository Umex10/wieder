package design.meins.factory;

public class Road implements Factory {

  @Override
  public void createMittel() {
    return new LKW();
  }
  
}

