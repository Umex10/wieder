package design.proxy;

public class Vivaldi implements  Internet{

    @Override
    public void connectTo(String url) {
        System.out.println("Connecting to: " + url);
    }
}
