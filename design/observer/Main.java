package design.observer;

public class Main {

    public static void main(String[] args) {

        Station station = new Station(0);

        Linux linux = new Linux();
        Windows windows = new Windows();

        station.addObserver(linux);
        station.addObserver(windows);

        station.setColdness(15);
        station.setColdness(25);
        station.setColdness(-5);

    }
}
