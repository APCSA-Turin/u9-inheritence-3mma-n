package U9T1_Lab2;

public class Desktop extends Computer {
    private boolean monitorIncluded;

    public Desktop(int screenSize, int memory, boolean monitorIncluded) {
        super(screenSize, memory);
        this.monitorIncluded = monitorIncluded;
    }

    public boolean isMonitorIncluded() {
        return monitorIncluded;
    }

    public void replaceTowerCasing() {
        System.out.println("Replaced tower case!");
    }
}
