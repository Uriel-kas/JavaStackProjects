package chapterSix.makingADiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAidedInstruction {
  public static void main(String[] args) {
    firstDigit();
    secondDigit();
    displayQuestion();
    collectStudentAnswer();
    basicMultiplication();
    compareAnswer();

    while (studentAnswer == correctAnswer) {
      firstDigit();
      secondDigit();
      displayQuestion();
      collectStudentAnswer();
      basicMultiplication();
      compareAnswer();
    }

    while (studentAnswer != correctAnswer) {
      collectStudentAnswer();
      compareAnswer();
    }
  }

  private static final SecureRandom digitGenerator = new SecureRandom();
  private static int studentAnswer;
  private static int correctAnswer;
  private static int firstDigit;

  private static int secondDigit;

  public static int firstDigit() {
    return firstDigit = 1 + digitGenerator.nextInt(9);
  }

  public static int secondDigit() {
    return secondDigit = 1 + digitGenerator.nextInt(9);
  }

  public static void displayQuestion() {
    System.out.print("How much is " + firstDigit + " times " + secondDigit + "?: ");
  }

  public static int basicMultiplication() {
    return correctAnswer = firstDigit * secondDigit;
  }

  public static int collectStudentAnswer() {
    Scanner input = new Scanner(System.in);
    return studentAnswer = input.nextInt();
  }

  public static void compareAnswer() {
    if (studentAnswer == correctAnswer) {
      System.out.println("Very good!");
    } else {
      System.out.println("No. Please try again.");
    }
  }
}
