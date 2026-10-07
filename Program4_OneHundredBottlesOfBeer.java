import java.util.Scanner;
public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int verses = 0;

    while (verses < 1 || verses > 100) {
      System.out.println("How many verses of the song \"One Hundred Bottles of Beer\" " + "would you like me to print? (1-100)");

      if (input.hasNextInt()) {
        verses = input.nextInt();

        if (verses < 1 || verses > 100) {
          System.out.println("Please enter a number from 1 to 100.");

        }
      } else {
          System.out.println("Please enter a whole number from 1 to 100.");
          input.next();
        }
      }

      int bottles = 100;

      for (int verse = 1; verse <= verses; verse++) {
        String bottleWord = "bottles";

        if (bottles == 1) {
          bottleWord = "bottle";
        }

        System.out.println(bottles + " " + bottleWord + " of beer on the wall");
        System.out.println(bottles + " " + bottleWord + " of beer");
        System.out.println("If one of those bottles should happen to fall");

        bottles--;

        bottleWord = "bottles";

        if (bottles == 1) {
          bottleWord = "bottle";
        }

        System.out.println(bottles + " " + bottleWord + " of beer on the wall");
        System.out.println();
      }
       input.close();
    }
  }
