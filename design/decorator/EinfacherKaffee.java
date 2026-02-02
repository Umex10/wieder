package design.decorator;

public class EinfacherKaffee implements Kaffee {

    private final double cost;

    public EinfacherKaffee(double cost) {
        this.cost = cost;
    }

    @Override
    public String desc() {
        return "Einfacher Kaffee";
    }
    @Override
    public double cost() {
        return cost;
    }
}
