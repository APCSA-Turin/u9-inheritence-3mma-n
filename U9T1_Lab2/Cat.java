package U9T1_Lab2;

public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean hidden;

    public Cat(String name, int age) {
        super(name, age);
        hasPlayedWith = false;
        hidden = false;
    }

    public void play() {
        if (!hasPlayedWith) {
            hasPlayedWith = true;
            System.out.println(getName() + " has now been played with!");
        } else {
            System.out.println(getName() + " was already played with today.");
        }
    }

    public void hide() {
        System.out.println(getName() + " went to go hide!");
        hidden = true;
    }

    public boolean isHidden() {
        return hidden;
    }
}