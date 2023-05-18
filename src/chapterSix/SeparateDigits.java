package chapterSix;

import java.util.Scanner;

public class SeparateDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        displayDigits(number);
    }
    // Calculate the integer part of the quotient when integer a is divided by integer b

  public static int quotient(int a, int b) {
    return a / b;
  }
    // Calculate the integer remainder when integer a is divided by integer b

  public static int remainder(int a, int b) {
    return a % b;
  }
    // Display an integer as a sequence of digits, separating each pair of digits by two spaces

  public static void displayDigits(int number) {
    // Calculate the quotient and remainder for each pair of digits, starting from the leftmost pair
    int quotient1 = quotient(number, 10);
    int remainder1 = remainder(number, 10);
    int quotient2 = quotient(quotient1, 10);
    int remainder2 = remainder(quotient1, 10);
    int quotient3 = quotient(quotient2, 10);
    int remainder3 = remainder(quotient2, 10);
    int quotient4 = quotient(quotient3, 10);
    int remainder4 = remainder(quotient3, 10);

    // Display the digits with two spaces between each pair
    System.out.printf(
        "%d  %d  %d  %d  %d%n",
        quotient4, remainder4, quotient3, remainder3, remainder2 * 10 + remainder1);
  }
}
