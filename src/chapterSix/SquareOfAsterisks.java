package chapterSix;

public class SquareOfAsterisks {
    
    public static void main(String[] args) {
        printSquare(4);
    }

  public static void printSquare(int length) {

    for (int i = 1; i <= length; i++) {
      for (int s = length; s > 0; s--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
