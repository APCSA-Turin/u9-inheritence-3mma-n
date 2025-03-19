package U9T1_Lab2;

public class Computer {
    private int screenSize;
    private int memory;

    public Computer(int s, int m) {
        screenSize = s;
        memory = m;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
