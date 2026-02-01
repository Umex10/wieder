package design.meins.decorater;

public class Main {

  public static void main(String[] args) {

  Juice kaffee = new Kaffee();

  kaffee = new Milch(kaffee);

  kaffee = new Milch(kaffee);

  System.out.println(kaffee.cost());
  }


  
}
