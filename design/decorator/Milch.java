package design.decorator;

public class Milch extends Decorator {

    public Milch(Kaffee kaffee) {super(kaffee);}

    @Override
    public String desc() {
        return kaffee.desc() + " mit Milch";
    }

    @Override
    public double cost() {
        return kaffee.cost() + 0.20;
    }
}
