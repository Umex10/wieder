package design.meins.roxy;

public class Proxy implements Internet {

  private Internet inte = new RealInternet();
  private static List<String> bannedSites = Arrays.asList("gefaehrlich.de", "spam.com");

  @Override
  public void BrowserInternet(String url) {
    if(bannedSites.contains(host.toLowerCase())) {
            throw new Exception("Zugriff verweigert: " + host);
        }
        
  }
}
