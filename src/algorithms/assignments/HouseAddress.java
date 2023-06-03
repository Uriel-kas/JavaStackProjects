package algorithms.assignments;

import java.util.Scanner;

public class HouseAddress {

  private static int oppositeHouseAddressNumber(int houseAddressNumber, int numberOfHousesOnTheStreet) {
    int opposite;
    if (houseAddressNumber % 2 == 0) {
      opposite = (numberOfHousesOnTheStreet * 2) - houseAddressNumber + 1;
    } else {
      opposite = (numberOfHousesOnTheStreet * 2) + 1 - houseAddressNumber;
    }
    return opposite;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the house address number: ");
    int houseAddress = input.nextInt();
    System.out.print("Enter the number of houses on the street: ");
    int numberOfHousesOnTheStreet = input.nextInt();
    int oppositeHouseAddress = oppositeHouseAddressNumber(houseAddress, numberOfHousesOnTheStreet);
    System.out.println(
        "This is the house address number on the opposite side of the street: "
            + oppositeHouseAddress);
  }
}
