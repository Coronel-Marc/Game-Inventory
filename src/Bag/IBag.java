package Bag;

public interface IBag {
    String template = "Bag";
    double space = 0.0;

    void open();
    void close();

    void checkInside();
}
