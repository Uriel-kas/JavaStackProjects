package algorithms.assignments;

import java.util.Scanner;

public class FuelCalculator {

  private static double totalDistanceTraveled(
      double fuel, double fuelUsage, int passengers, boolean airConditioner) {

    double fuelConsumedDueToPassengers = passengers * (fuelUsage * 0.05);
    double fuelUsageWithAirConditioner = 0.0;
    if (airConditioner) {
      fuelUsageWithAirConditioner = fuelUsage * 0.1;
    }
    double totalFuelConsumption =
        fuelUsage + fuelConsumedDueToPassengers + fuelUsageWithAirConditioner;
    double maxDistanceTraveled = (fuel / totalFuelConsumption) * 100.0;
    return maxDistanceTraveled;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hi driver, welcome!");
    System.out.print("Input the fuel amount: ");
    double fuelAmount = input.nextDouble();
    System.out.print("Please enter your usage per 100km: ");
    double fuelPerKM = input.nextDouble();
    System.out.print("Please how many passengers are on board: ");
    int passengersOnBoard = input.nextInt();
    System.out.print("Airconditioner turned on/off true or false: ");
    boolean airconditioner = input.nextBoolean();

    double carUtil =
        totalDistanceTraveled(fuelAmount, fuelPerKM, passengersOnBoard, airconditioner);
    System.out.printf("Here's your total distance report: %.2f", carUtil);
  }
}
