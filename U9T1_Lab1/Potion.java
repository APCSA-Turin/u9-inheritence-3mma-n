package U9T1_Lab1;

public class Potion extends Item {
    int quantity;

    public Potion(String name, int level, int quantity) {
        super(name, level);
        this.quantity = quantity;
    }

    public void drink() {
        quantity--;
        System.out.println("Drinking potion, " + quantity + " remain.");
    }
}
