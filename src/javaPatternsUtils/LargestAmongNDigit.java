package javaPatternsUtils;

import java.util.Scanner;

public class LargestAmongNDigit {

    public static void main(String[] args) {
        int n;
        int a[];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number: ");
        n = input.nextInt();

        a = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int max = maxNumber(a, n);
        System.out.print("The largest number is " +max);
    }
    static int maxNumber(int[] a, int n) {

        int m = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }
}
