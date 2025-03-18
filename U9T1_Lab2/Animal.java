package U9T1_Lab2;

public class Animal {
    String name;
    int age;
    boolean vaccinated;
    Animal friend;

    public Animal(String n, int a) {
        name = n;
        age = a;
        vaccinated = false;
        friend = null;
    }

    public void adopt() {
        System.out.println("My name is " + name + " and I am " + age + " years old.")
        System.out.println("Thank you for adopting me!");
    }

    public void feed() {
        System.out.println(name + " has been fed.");
    }

    public void makeFriends(Animal other) {
        if (this.friend == null) {
            friend = other;
            System.out.println(name + " has become friends with " + friend.name);
        } else {
            System.out.println(name + " already has a friend, " + friend.name);
        }
    }

    public Animal getFriend() {
        return friend;
    }
}
