package design.proxy;

public class MiddleMan implements  Internet {

    private Internet internet;

    public MiddleMan(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connectTo(String url) {
        System.out.println("Check...");
        internet.connectTo(url);
    }

}
