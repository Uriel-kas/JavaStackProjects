package algorithms.assignments;

import java.util.Scanner;

public class Paradiddles {

  private static int spinAround(String[] directions) {
    int degreesTurned = 0;
    for (int i = 0; i < directions.length; i++) {
      String direction = directions[i];
      if ("right".equals(direction)) {
        degreesTurned += 90;
      } else if ("left".equals(direction)) {
        degreesTurned -= 90;
      }
    }
    int numberOfDegTurned = Math.abs(degreesTurned) / 360;
    return numberOfDegTurned;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the directions separated by spaces: ");
    String directionsInput = input.nextLine();
    String[] directions = directionsInput.split(" ");

    int turned = spinAround(directions);
    System.out.printf("You spun %d time(s)%n", turned);
  }
}