package algorithms.assignments;

import java.util.Scanner;

public class MissingNumber {

  public static int missingNum(int[] numbers) {
    int sumOfNumbers = 55;
    for (int i = 0; i < numbers.length; i++) {
      sumOfNumbers -= numbers[i];
    }
    return sumOfNumbers;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arrayOfNumbers = new int[9];
    System.out.print(
        "Enter 9 numbers between 1 and 10 (excluding one number) with a space between: ");
    for (int i = 0; i < 9; i++) {
      arrayOfNumbers[i] = scanner.nextInt();
    }
    int missingNumber = missingNum(arrayOfNumbers);
    System.out.println("The missing number is: " + missingNumber);
  }
}

// 1 2 3 4 6 7 8 9 10
// 7 2 3 6 5 9 1 4 8
// 10 5 1 2 4 6 8 3 9