package algorithms.assignments;

import java.util.Scanner;

public class VowelsOrganiser {

  private static boolean isVowel(char letter) {
    String vowelLetters = "aeiouAEIOU";
    return vowelLetters.contains(String.valueOf(letter));
  }

  private static String split(String input) {
    String vowels = "";
    String consonants = "";
    char[] chars = input.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      char letter = chars[i];
      if (isVowel(letter)) {
        vowels += letter;
      } else {
        consonants += letter;
      }
    }
    return vowels + consonants;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter words to be split: ");
    String wordsToSplit = input.nextLine();
    String splitWords = split(wordsToSplit);
    System.out.println(
        "This is the split word in the order of vowel then consonants and other characters: "
            + splitWords);
  }
}

// abcde - aebcd
// Hello! - eOHil!
// What's the time? - aeiewht's th tm?
