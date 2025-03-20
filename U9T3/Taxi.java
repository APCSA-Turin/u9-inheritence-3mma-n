package U9T3;

public class Taxi extends Car {
    private double fareColelcted;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareColelcted) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareColelcted = fareColelcted;
    }

    public double getFareCollected() {
        return fareColelcted;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareColelcted);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareColelcted += numRiders * farePerRider;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() / 2);
            setDiscountApplied();
          }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareColelcted += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
    }

    public void start() {
        super.start();
        System.out.println(getPassengers() + " seats currently taken.");
        System.out.println("Available to pick up passengers!");
    }
}
