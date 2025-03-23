package ZZZ_FunTestThings;

public class Entity {

    private String icon;
    private int row;
    private int col;

    public Entity() {
        icon = "A";
    }

    public Entity(String s) {
        icon = s;
    }

    public String toString() {
        return icon;
    }
}
