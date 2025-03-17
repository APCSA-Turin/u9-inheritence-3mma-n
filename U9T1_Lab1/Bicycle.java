package U9T1_Lab1;

public class Bicycle extends Vehicle {

    int gearCount;

    public Bicycle(String name, int wheels, int gearCount) {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public void ringBell() {
        System.out.println("Ding Ding! Watch Out!");
    }

    public int getGearCount() {
        return gearCount;
    }
}