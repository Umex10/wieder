package design.meins.decorater;

public abstract class Decorator implements Juice {

  protected Juice kaffee;

  public Decorator(Juice kaffee) {
    this.kaffee = kaffee;
  }
}
