package javaPatternsUtils;

import java.util.Scanner;

public class MinMax {

    int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want entered: ");
        n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter [" + (i + 1) + "] element: ");
            arr[i] = input.nextInt();
        }
        MinMax mm = new MinMax();
        System.out.println("Maximum value is: " + mm.getMax(arr));
        System.out.println("Minimum value is: " + mm.getMin(arr));
    }
}
