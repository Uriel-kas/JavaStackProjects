package chapterFour.exercises;

import java.util.Scanner;

public class Decryptor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an encrypted four-digit integer: ");
        int encryptedNumber = input.nextInt();
        // Convert the encrypted integer to a string
        String encryptedString = String.valueOf(encryptedNumber);
        // Swap the digits
        char[] swappedChars = new char[4];
        swappedChars[0] = encryptedString.charAt(2);
        swappedChars[1] = encryptedString.charAt(3);
        swappedChars[2] = encryptedString.charAt(0);
        swappedChars[3] = encryptedString.charAt(1);
        // Decrypt the digits
        char[] decryptedChars = new char[4];
        for (int i = 0; i < 4; i++) {
            int digit = Character.getNumericValue(swappedChars[i]);
            digit = (digit + 3) % 10;
            decryptedChars[i] = (char) (digit + '0');
        }
        // Convert the decrypted chars back to an integer
        int decryptedNumber = Integer.parseInt(new String(decryptedChars));
        // Print the decrypted integer
        System.out.println("The decrypted integer is " + decryptedNumber);
    }
}

