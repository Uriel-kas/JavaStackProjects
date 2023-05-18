package chapterFour.exercises;

import java.util.Scanner;

public class Encryptor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input the four-digit integer
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();
        // Convert the integer to a string
        String numberString = String.valueOf(number);
        // Encrypt the digits
        char[] encryptedChars = new char[4];
        for (int i = 0; i < 4; i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            digit = (digit + 7) % 10;
            encryptedChars[i] = (char) (digit + '0');
        }
        // Swap the digits
        char temp = encryptedChars[0];
        encryptedChars[0] = encryptedChars[2];
        encryptedChars[2] = temp;
        temp = encryptedChars[1];
        encryptedChars[1] = encryptedChars[3];
        encryptedChars[3] = temp;
        // Convert the encrypted chars back to an integer
        int encryptedNumber = Integer.parseInt(new String(encryptedChars));
        // Print the encrypted integer
        System.out.println("The encrypted integer is " + encryptedNumber);
    }
}
