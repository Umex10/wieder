package design.meins.strategy;

public class Card implements Pay {

  public void pay(int amount) {
    System.out.println("Card" + amount);
  }
  
}
