package design.observer;

public class Windows implements  Observer{

    @Override
    public void update(int coldness) {
        System.out.println("Windows: The coldness changed... to: " + coldness);
    }
}

