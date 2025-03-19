package U9T1_Lab3;

public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public void printCar() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Electric? " + electric);
    System.out.println("Discount applied? " + discountApplied);
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut >= getPassengers()) {
      return false;
    }
    setPassengers(getPassengers() - numOut);
    return true;
  }

  public void applyDiscount() {
    if (electric && !discountApplied) {
      setTollFee(getTollFee() / 2);
      discountApplied = true;
    }
  }

  public void setDiscountApplied() {
    discountApplied = true;
  }
}