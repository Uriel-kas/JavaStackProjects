package chapterTwo;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        int thisIsAVariable;
        int q761354;
        int number;

        System.out.print("Enter an integer: ");
        thisIsAVariable = input.nextInt();

        System.out.println(thisIsAVariable);

        System.out.println("This is a Java program");
        System.out.printf("%s%n%s%n", "This is a Java", "Program");

        if(thisIsAVariable != 7) {
            System.out.println("The variable number is not equal to 7.");
        }
    }
}
