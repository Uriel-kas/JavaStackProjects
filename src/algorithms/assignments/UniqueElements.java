package algorithms.assignments;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueElements {

  public static boolean same(int[] arr1, int[] arr2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    for (int num : arr1) {
      set1.add(num);
    }
    for (int num : arr2) {
      set2.add(num);
    }
    return set1.size() == set2.size();
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the elements of the first array (separated by spaces): ");
    String[] input1 = scanner.nextLine().split(" ");
    int[] arr1 = new int[input1.length];
    for (int i = 0; i < input1.length; i++) {
      arr1[i] = Integer.parseInt(input1[i]);
    }

    System.out.print("Enter the elements of the second array (separated by spaces): ");
    String[] input2 = scanner.nextLine().split(" ");
    int[] arr2 = new int[input2.length];
    for (int i = 0; i < input2.length; i++) {
      arr2[i] = Integer.parseInt(input2[i]);
    }
    boolean result = same(arr1, arr2);
    System.out.println("The arrays have the same number of unique elements: " + result);
  }
}
// [1 3 4 4 4] [2 5 7]
// [9 8 7 6] [4 4 3 1]
// [2] [3 3 3 3 3]
