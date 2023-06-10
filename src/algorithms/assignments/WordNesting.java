package algorithms.assignments;

import java.util.Scanner;

public class WordNesting {

  private static int wordNest(String startWord, String finalWord) {
    int depth = 0;
    String wordsToFind = finalWord;

    while (wordsToFind.contains(startWord)) {
      wordsToFind = wordsToFind.replaceFirst(startWord, "");
      depth++;
    }
    return depth - 1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the start word: ");
    String startWord = input.nextLine();
    System.out.print("Please enter your final words of nesting your start word: ");
    String nestedWords = input.nextLine();

    int depth = wordNest(startWord, nestedWords);
    System.out.print("This is the depth of your start word in the nested words: " + depth);
  }
}

// code, cocodccococodededeodeede - 5
// floor, floor - 0
// incredible, increinincrincredibleediblecredibledible - 3