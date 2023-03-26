package javaPatternsUtils;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        year = input.nextInt();

        if(year % 400 == 0) {
            System.out.print(year+" is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year+" is not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.print(year+" is a Leap Year.");
        } else {
            System.out.print(year+" is not a Leap Year.");
        }
    }
}
