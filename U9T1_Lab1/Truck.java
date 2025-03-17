package U9T1_Lab1;

public class Truck extends Vehicle{

    int boxesLoaded;

    public Truck(String name, int wheels) {
        super(name, wheels);
        boxesLoaded = 0;
    }

    public void loadBoxes(int n) {
        boxesLoaded += n;
        System.out.println(n + " boxes have been added!");
    }

    public int DeliverBoxes() {
        System.out.println("All " + boxesLoaded + " boxes have been delivered!");
        int toDeliver = boxesLoaded;
        boxesLoaded = 0;
        return toDeliver;
    }

    public int getBoxesLoaded() {
        return boxesLoaded;
    }
}
