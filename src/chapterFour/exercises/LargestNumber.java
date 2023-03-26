package chapterFour.exercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int largest = number;

        while(counter < 5){
            System.out.print("Enter another number: ");
            number = input.nextInt();

            if (number > largest)
                largest = number;
            counter++;
        }

        System.out.println("The largest number is " + largest);
    }
}
