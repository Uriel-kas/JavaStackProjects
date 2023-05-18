package javaPatternsUtils;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {
        int side;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side: ");
        side = input.nextInt();
        area = (float) (Math.sqrt(3) * (side * side)) / 4;
        System.out.print("\nArea of Equilateral Triangle: " + area);
    }
}
