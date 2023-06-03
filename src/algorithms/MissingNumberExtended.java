package algorithms;

import java.util.Scanner;

public class MissingNumberExtended {
  // Method to calculate sum of 'n' numbers

  private static int sumOfNnumbers(int n) {
    int sum = (n * (n + 1)) / 2;
    return sum;
  }

  // Method to calculate sum of all elements of array

  private static int sumOfElements(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();

    int[] a = new int[n - 1];
    System.out.println("Enter " + (n - 1) + " numbers within the range of 1 to " + n + ":");
    for (int i = 0; i < n - 1; i++) {
      a[i] = scanner.nextInt();
    }

    int sumOfNnumbers = sumOfNnumbers(n);
    int sumOfElements = sumOfElements(a);
    int missingNumber = sumOfNnumbers - sumOfElements;
    System.out.println("Missing Number is = " + missingNumber);
  }
}
