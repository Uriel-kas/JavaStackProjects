package chapterFive.exercise;

public class TwelveDaysOfChristmas {

  public static void main(String[] args) {
    int daysOfChristmas = 1;

    while (daysOfChristmas <= 12) {

      switch (daysOfChristmas) {
          case 1:
            System.out.print("On the first");
            break;
          case 2:
            System.out.print("On the second");
            break;
          case 3:
            System.out.print("On the third");
            break;
          case 4:
            System.out.print("On the fourth");
            break;
          case 5:
            System.out.print("On the fifth");
            break;
          case 6:
            System.out.print("On the sixth");
            break;
          case 7:
            System.out.print("On the seventh");
            break;
          case 8:
            System.out.print("On the eighth");
            break;
          case 9:
            System.out.print("On the ninth");
            break;
          case 10:
            System.out.print("On the tenth");
            break;
          case 11:
            System.out.print("On the eleventh");
            break;
          case 12:
            System.out.print("On the twelfth");
            break;
          default:
            System.out.print(" ");
      }
      System.out.println(" day of Christmas, my true love sent to me, ");

      switch (daysOfChristmas) {
        case 1:
          System.out.println("a partridge in a pear tree\n");
          break;
        case 2:
          System.out.println("Two turtle doves and a partridge in a pear tree \n");
          break;
        case 3:
          System.out.println(
              "Three French hens, two turtle doves and a partridge in a pear tree \n");
          break;
        case 4:
          System.out.println(
              "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n"
                  + "\n");
          break;
        case 5:
          System.out.println(
              "Five gold rings, four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n"
                  + "\n");
          break;
        case 6:
          System.out.println(
              "Six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 7:
          System.out.println(
              "Seven swans a swimming, six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 8:
          System.out.println(
              "Eight maids a milking, seven swans a swimming\n"
                  + "Six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 9:
          System.out.println(
              "Nine ladies dancing, eight maids a milking\n"
                  + "Seven swans a swimming, six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 10:
          System.out.println(
              "Ten lords a leaping, nine ladies dancing, eight maids a milking\n"
                  + "Seven swans a swimming, six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 11:
          System.out.println(
              "Eleven pipers piping, ten lords a leaping\n"
                  + "Nine ladies dancing, eight maids a milking\n"
                  + "Seven swans a swimming, six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        case 12:
          System.out.println(
              "Twelve drummers drumming, eleven pipers piping\n"
                  + "Ten lords a leaping, nine ladies dancing, eight maids a milking\n"
                  + "Seven swans a swimming, six geese a laying, five gold rings\n"
                  + "Four calling birds, three French hens\n"
                  + "Two turtle doves and a partridge in a pear tree\n");
          break;
        default:
          System.out.println(" ");
          break;
      }
        daysOfChristmas++;
    }
  }
}
