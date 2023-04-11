package javaPatternsUtils;

import java.util.Scanner;

public class FascinatingNumbers {

    static boolean isFascinating(int n) {
        String strNum = ""+n+(n*2) + (n*3);
        int freq[] = new int[11];

        for (int i = 0; i < strNum.length(); i++) {
            int digit = strNum.charAt(i) - '0';
            freq[digit]++;
        }
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Generating all 3 digit fascinating numbers: ");
        for (int i = 100; i <= 999; i++) {
            if (isFascinating(i)) {
                System.out.println(i+"");
            }
        }
    }
}
