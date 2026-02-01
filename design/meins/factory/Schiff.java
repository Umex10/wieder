package design.meins.factory;

public class Schiff implements Mittel {

  @Override
  public void liefere() {
    System.out.println("Schiff");
  }
  
}

