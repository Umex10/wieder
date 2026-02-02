package design.structure;


public class Bike implements Route{
    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Berechne Bike-Route ohne Autobahnen");
    }
}

