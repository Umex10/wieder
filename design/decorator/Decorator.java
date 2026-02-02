package design.decorator;

public abstract class Decorator implements Kaffee {

    protected Kaffee kaffee;

    public Decorator(Kaffee kaffee) {this.kaffee = kaffee;}

}
