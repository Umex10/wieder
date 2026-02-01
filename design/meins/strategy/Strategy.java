package design.meins.strategy;

public class Strategy {

  public static void main(String[] args) {
    Cart cart = new Cart();
    Card pay = new Card();
    cart.setStrategy(pay);

    cart.checkout();

  }

}
