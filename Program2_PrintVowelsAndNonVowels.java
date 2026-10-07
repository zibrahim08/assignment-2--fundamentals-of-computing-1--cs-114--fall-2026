import java.util.Scanner;
public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;
    int vowelCount = 0;
    int nonVowelCount = 0;

    System.out.println("Please enter a random set of numbers and characters");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    String lowercaseInput = userInput.toLowerCase();

    for(int position = 0; position < lowercaseInput.length(); position++){
      char current = lowercaseInput.charAt(position);
      switch (current){
        case 'a':
          aCount++;
          vowelCount++;
          break;

        case 'e':
          eCount++;
          vowelCount++;
          break;

        case 'i':
          iCount++;
          vowelCount++;
          break;

        case 'o':
          oCount++;
          vowelCount++;
          break;

        case 'u':
          uCount++;
          vowelCount++;
          break;

        default:
          nonVowelCount++;
      }
    }
    System.out.println("Number of A is:" + aCount);
    System.out.println("Number of E is:" + eCount);
    System.out.println("Number of I is:" + iCount);
    System.out.println("Number of O is:" + oCount);
    System.out.println("Number of U is:" + uCount);
    System.out.println("The total number of Vowels is:" + vowelCount);
    System.out.println("The total number of Non-Vowels is:" + nonVowelCount);

    input.close();
  }
}
