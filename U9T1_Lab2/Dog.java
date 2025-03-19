package U9T1_Lab2;

public class Dog extends Animal {
    private boolean hasBeenWalked;
    private String favoritePark;

    public Dog(String name, int age) {
        super(name, age);
        hasBeenWalked = false;
        favoritePark = "None";
    }

    public void walk() {
        if (!hasBeenWalked) {
            hasBeenWalked = true;
            System.out.println(getName() + " has now been walked!");
        } else {
            System.out.println(getName() + " was already walked today.");
        }
    }

    public void goToPark(String park) {
        System.out.println(getName() + " is going to ");
        System.out.println("This is " + getName() + "'s new favorite park!");
        favoritePark = park;
    }

    public String getFavoritePark() {
        return favoritePark;
    }
}