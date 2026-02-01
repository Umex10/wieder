package design.meins.decorater;

public class Milch extends Decorator {

  public Milch(Juice kaffee) {super(kaffee);}

  public String desc() {return "Kaffee mit Milch";}
  public double cost() {return kaffee.cost() + 0.50;}
  
}
