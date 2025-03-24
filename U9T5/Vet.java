package U9T5;
import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String n) {
        vetName = n;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal client) {
        if (clients.contains(client)) {
            System.out.println(client.getName() + " is already a client of " + vetName);
            return false;
        }
        clients.add(client);
        System.out.println("Welcome to " + vetName + "'s office, " + client.getName());
        return true;
    }

    public void printClientList() {
        for (Animal c : clients) {
            System.out.println(c.getName() + ": class " + c.getClass());
        }
    }
}
