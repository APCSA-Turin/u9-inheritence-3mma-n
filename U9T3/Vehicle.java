package U9T3;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int n) {
        passengers = n;
    }

    public void setTollFee(double n) {
        tollFee = n;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public void printInfo() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
    }

    public void start() {
        System.out.println("Engines heating up...");
        System.out.println("Dashboard on...");
        System.out.println("Ready to drive.");
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("MC56WQ", 10.75, 5);
        myVehicle.start();

        Car myCar = new Car("KXN73F", 8.50, 2, true);
        myCar.start();

        Truck myTruck = new Truck("3K9JMX", 24.75, 4, 6, true);
        myTruck.start();

        Taxi myTaxi = new Taxi("KXN73F", 8.50, 2, true, 8);
        myTaxi.start();
    }

}