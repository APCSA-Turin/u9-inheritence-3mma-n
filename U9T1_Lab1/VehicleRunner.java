package U9T1_Lab1;
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBike = new Bicycle("Red Bike", 2, 5);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        System.out.println("I have " + myBike.getGearCount() + " gears.");
        myBike.turn();
        myBike.move(40);
        myBike.ringBell();
        myBike.brake();

        // ---- TRUCK TEST CODE ----
        Truck myTruck = new Truck("Amazon Truck", 18);
        System.out.println(myTruck.getName());
        System.out.println(myTruck.getWheels());
        myTruck.loadBoxes(7);
        System.out.println(myTruck.getBoxesLoaded());
        myTruck.move(15);
        myTruck.turn();
        myTruck.brake();
        myTruck.DeliverBoxes();
        System.out.println(myTruck.getBoxesLoaded());

    }
}