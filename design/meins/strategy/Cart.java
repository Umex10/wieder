package design.meins.strategy;

public class Cart {

  private Pay client;

  public void setStrategy(Pay client) {
    this.client = client;
  }

  public void checkout(int amount) {
    client.pay(amount);
  }
  
}
