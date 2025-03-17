package U9T1_Lab1;

public class Item {
    String name;
    int level;

    public Item(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void obtain() {
        System.out.println("Obtained " + name + " of level " + level);
    }

    public void upgrade(int n) {
        level += n;
        System.out.println("Upgrading to level " + level);
    }

    public static void main(String[] args) {
        Item myItem = new Item("Wand of Sparking", 1);
        myItem.obtain();
        myItem.upgrade(4);
        System.out.println();

        Sword mySword = new Sword("Copper Shortsword", 2, 8);
        mySword.obtain();
        mySword.slash();
        mySword.upgrade(1);
        System.out.println();

        Potion myPotion = new Potion("Lesser Healing Potion", 4, 3);
        myPotion.obtain();
        myPotion.upgrade(3);
        myPotion.drink();
    }

}
