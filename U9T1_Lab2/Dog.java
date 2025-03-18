package U9T1_Lab2;

public class Dog extends Animal {
    boolean hasBeenWalked;
    String favoritePark;

    public Dog(String name, int age) {
        super(name, age);
        hasBeenWalked = false;
        favoritePark = "None";
    }

    public void walk() {
        if (!hasBeenWalked) {
            hasBeenWalked = true;
            System.out.println(name + " has now been walked!");
        } else {
            System.out.println(name + " was already walked today.");
        }
    }

    public void goToPark(String park) {
        System.out.println(name + " is going to ");
        System.out.println("This is " + name + "'s new favorite park!");
        favoritePark = park;
    }

    public String getFavoritePark() {
        return favoritePark;
    }
}