package design.proxy;

public class Main {

    public static void main(String[] args) {

        MiddleMan middleMan = new MiddleMan(new Vivaldi());

        middleMan.connectTo("Youtube.com");

    }
}
