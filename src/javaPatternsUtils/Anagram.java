package javaPatternsUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static  boolean isAnagram(String str1, String str2) {
        char[] w1 = str1.replaceAll("[\\s]","").toCharArray();
        char[] w2 = str2.replaceAll("[\\s]","").toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1,w1);
    }

    public static void main(String[] args) {
        String str1, str2;
        boolean check;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        str1 = input.nextLine();
        System.out.print("Enter second string: ");
        str2 = input.nextLine();
        check = isAnagram(str1, str2);
        if (check == true) {
            System.out.print(" '" + str1 + "' and '" + str2 + "' are Anagrams.");
        } else {
            System.out.print(" '" + str1 + "' and '" + str2 + " ' not are Anagrams.");
        }
    }
}
