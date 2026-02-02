package design.structure;

public class Navi {
    private  Route strategy;

    public void setStrategy(Route strategy) {
        this.strategy = strategy;
    }

    public void navigate(String start, String end) {
        strategy.calculateRoute(start, end);
    }
}
