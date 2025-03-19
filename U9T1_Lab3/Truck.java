package U9T1_Lab3;

public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public int getAxles() {
    return axles;
  }

  public boolean hasTrailer() {
    return hasTrailer;
  }

  public void printTruck() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate() {
    if (!hasTrailer) {
      return true;
    }
    if (axles > 4) {
      if (getLicensePlate().substring(4).equals("MX")) {
        return true;
      }
    } else {
      if (getLicensePlate().substring(4).equals("LX")) {
        return true;
      }
    }
    return false;
  }
}