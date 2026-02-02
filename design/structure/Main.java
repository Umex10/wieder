package design.structure;

public class Main {
    public static void main(String[] args) {

        Navi navi = new Navi();

        navi.setStrategy(new Car());
        navi.navigate("Wien", "klaenfurt");

        navi.setStrategy(new Bike());
        navi.navigate("Amsterdam", "London");

        navi.setStrategy(new Walk());
        navi.navigate("London", "Barca");
    }
}
