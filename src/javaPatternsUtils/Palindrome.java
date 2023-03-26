package javaPatternsUtils;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String a,b;
        StringBuffer sb;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to check if it is a palindrome: ");
        a = input.nextLine();
        sb = new StringBuffer(a);
        b = sb.reverse().toString();
        if (a.equals(b)) {
            System.out.print("Entered string is a palindrome.");
        } else {
            System.out.print("Entered string is not a palindrome.");
        }
    }
}
