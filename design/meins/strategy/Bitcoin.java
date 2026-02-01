package design.meins.strategy;

public class Bitcoin implements Pay {

  public void pay(int amount) {
    System.out.println("Bitcoin" + amount);
  }
  
}
