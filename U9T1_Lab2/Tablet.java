package U9T1_Lab2;

public class Tablet extends Computer {
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded) {
        super(screenSize, memory);
        this.stylusIncluded = stylusIncluded;
    }

    public boolean isStylusIncluded() {
        return stylusIncluded;
    }
}
