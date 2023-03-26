package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 4) {
            System.out.print("Enter Grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
        }

        int average = total / 10;

        System.out.println("\nTotal of all ten grades are: " + total);
        System.out.printf("Class Average is: %d%n", average);
    }
}
