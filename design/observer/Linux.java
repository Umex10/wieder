package design.observer;

public class Linux implements  Observer{

    @Override
    public void update(int coldness)
    {
        System.out.println("Linux: The coldness changed... to: " + coldness);
    }
}
