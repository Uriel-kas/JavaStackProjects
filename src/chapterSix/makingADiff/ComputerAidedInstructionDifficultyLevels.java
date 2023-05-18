package chapterSix.makingADiff;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAidedInstructionDifficultyLevels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter\n" +
                           "1 for one-digit multiplication exercises\n" +
                           "2 for two-digit multiplication exercises\n" +
                           "3 for three-digit multiplication exercises\n");
        int difficultyLevel = input.nextInt();
        int percentageAnswer = 0;

        if(difficultyLevel >= 1 && difficultyLevel <= 3) {
            for (int i = 1; i <= 10; i++) {
                firstDigit(difficultyLevel);
                secondDigit(difficultyLevel);
                displayQuestion();
                collectStudentAnswer();
                basicMultiplication();
                compareAnswer();
                percentageAnswer += 10;
            }

            while (studentAnswer != correctAnswer) {
                collectStudentAnswer();
                compareAnswer();
                percentageAnswer -= 10;
            }
            System.out.println(percentageAnswer);

            if (percentageAnswer < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    }
    private static final SecureRandom digitGenerator = new SecureRandom();
    private static int studentAnswer;
    private static int correctAnswer;
    private static int firstDigit;

    private static int secondDigit;

    public static int firstDigit(int userInput) {
        if(userInput == 1) {
            return firstDigit = 1 + digitGenerator.nextInt(9);
        } else if (userInput == 2) {
            return firstDigit = 1 + digitGenerator.nextInt(99);
        } else return firstDigit = 1 + digitGenerator.nextInt(999);
    }

    public static int secondDigit(int userInput) {
        if(userInput == 1) {
            return secondDigit = 1 + digitGenerator.nextInt(9);
        } else if (userInput == 2) {
            return secondDigit = 1 + digitGenerator.nextInt(99);
        } else return secondDigit = 1 + digitGenerator.nextInt(999);
    }

    public static void displayQuestion() {
        System.out.println("How much is " + firstDigit + " times " + secondDigit + "?");
    }

    public static int basicMultiplication() {
        return correctAnswer = firstDigit * secondDigit;
    }

    public static int collectStudentAnswer() {
        Scanner input = new Scanner(System.in);
        return studentAnswer = input.nextInt();
    }

    public static void positiveComments() {
        int positiveComments = 1 + digitGenerator.nextInt(4);
        switch (positiveComments) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }


    public static void negativeComments() {
        int negativeComments = 1 + digitGenerator.nextInt(4);
        switch (negativeComments) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void compareAnswer() {
        if (studentAnswer == correctAnswer) {
            positiveComments();
        } else {
            negativeComments();
        }
    }


}
