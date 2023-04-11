package javaPatternsUtils;

import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        int n;
        int i;
        int c;
        int a = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Floyd's triangle to print: ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (c = 1; c <= i; c++) {
                System.out.print(a);
                a++;
            }
            System.out.print("\n");
        }
    }
}
