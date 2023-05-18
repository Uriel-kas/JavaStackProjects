package algorithms.assignments;

import java.util.Scanner;

public class HighsAndLows {

  private static String highestLowest(String numbers) {
    String[] numberArrays = numbers.split(" ");
    int lowestNum = Integer.parseInt(numberArrays[0]);
    int highestNum = Integer.parseInt(numberArrays[0]);

    for (int i = 1; i < numberArrays.length; i++) {
      int num = Integer.parseInt(numberArrays[i]);
      if (num > highestNum) {
        highestNum = num;
      }
      if (num < lowestNum) {
        lowestNum = num;
      }
    }
    return highestNum + " and " + lowestNum;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers with a space between them to determine the highest and lowest: ");
      String numberRanges = input.nextLine();
      String result = highestLowest(numberRanges);
      System.out.println("Highest and Lowest Numbers: \"" + result + "\"");
  }
}
