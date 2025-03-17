package U9T1_Lab1;

public class Sword extends Item {
    int damage;

    public Sword(String name, int level, int damage) {
        super(name, level);
        this.damage = damage;
    }

    public void slash() {
        System.out.println("Attacking for " + damage + " damage!");
    }
}
