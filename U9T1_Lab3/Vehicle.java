package U9T1_Lab3;

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
}