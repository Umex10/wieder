package design.structure;

public class Car implements Route{

    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Berechne Auto-Route über Autobahnen");
    }
}
