package javaPatternsUtils;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        int b;
        int h;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of breadth and height: ");
        b = input.nextInt();
        h = input.nextInt();
        area = (float) (b * h) / 2;
        System.out.print("Area of the triangle = " + area);
    }
}
