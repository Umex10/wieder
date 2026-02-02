package design.decorator;

public class Main {
    public static void main(String[] args) {

        Kaffee kaffee = new EinfacherKaffee(0.85);

        kaffee = new Milch(kaffee);

        kaffee = new Zucker(kaffee);

        System.out.println(kaffee.desc());
        System.out.println("Kostet: " + kaffee.cost());
    }
}
