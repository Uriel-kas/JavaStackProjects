package javaPatternsUtils;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        int length;
        int breadth;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        length = input.nextInt();
        System.out.print("Enter the Breadth of rectangle: ");
        breadth = input.nextInt();
        area = length * breadth;
        System.out.print("Area of Rectangle: " + area);
    }
}
