package design.meins.singel;

public class Singel {

  private static Singel instance;

  private Singel() {};

  public static Singel getInstance() {
    if (instance == null) {
      instance = new Singel();
    }

    return instance;
  }
  
}
