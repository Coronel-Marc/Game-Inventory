package Bag;

public class Backpack implements IBag{
    String template = "Backpack";
    double space = 10.0;

    @Override
    public void open() {
        System.out.println("Opening the backpack...");
    }

    @Override
    public void close() {
        System.out.println("Closing the backpack.");
    }

    @Override
    public void checkInside() {

    }
}
