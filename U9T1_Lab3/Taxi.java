package U9T1_Lab3;

public class Taxi extends Car {
    private double fareColelcted;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareColelcted) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareColelcted = fareColelcted;
    }

    public double getFareCollected() {
        return fareColelcted;
    }

    public void printTaxi() {
        printCar();
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
}
