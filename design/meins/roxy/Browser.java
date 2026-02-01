package design.meins.roxy;

public class Browser implements Internet {

  @Override
  public void BrowserInternet(String url) {
    System.out.println("Connect to: " + url);
  }
  
}
