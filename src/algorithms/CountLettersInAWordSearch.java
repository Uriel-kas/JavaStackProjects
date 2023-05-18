package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountLettersInAWordSearch {

  private static List<Object> data() {
    String[] letterOne = {"D", "E", "Y", "H", "A", "D"};
    String[] letterTwo = {"C", "B", "Z", "Y", "J", "K"};
    String[] letterThree = {"D", "B", "C", "A", "M", "N"};
    String[] letterFour = {"F", "G", "G", "R", "S", "R"};
    String[] letterFive = {"V", "X", "H", "A", "S", "S"};
    List<Object> housingLetters = new ArrayList<>();
    housingLetters.add(letterOne);
    housingLetters.add(letterTwo);
    housingLetters.add(letterThree);
    housingLetters.add(letterFour);
    housingLetters.add(letterFive);
    return housingLetters;
  }

  private static void letterCounter(List<Object> data, String letterToSearch) {
    int counter = 0;
    for (int i = 0; i < data.size(); i++) {
      String[] arrayToSearch = (String[]) data.get(i);
      for (int j = 0; j < arrayToSearch.length; j++) {
        String letter = arrayToSearch[j];
        if (letter.equals(letterToSearch)) {
          counter++;
        }
      }
    }
    System.out.println("The number of occurrence is " + counter);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter letter to search: ");
    String letterToSearch = input.next();
    letterCounter(data(), letterToSearch);
  }
}
