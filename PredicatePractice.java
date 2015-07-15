import java.util.Scanner;

public class PredicatePractice
{
  public static void main(String[] args)
  {
    int num = 0;
    char letter;
    String type = "", sentence = "";
    Scanner inputNum = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    Scanner inputType = new Scanner(System.in);
    System.out.print("Enter problem type (number or sentence): ");
    type = inputType.next();
    if (type.equals("number")) {
      System.out.print("Enter integer for analysis: ");
      num = inputNum.nextInt();
      System.out.println("This number is even: " + isEven(num));
    }
    else if (type.equals("sentence")) {
      System.out.print("Enter sentence for analysis: ");
      sentence = inputString.nextLine();
      System.out.println("This sentence has " + countVowels(sentence) + " vowels.");
    }
    else
      System.out.println("Please enter \"number\" or \"sentence\"");
  }

  static Boolean isEven(int num) {
    return num%2==0;
  }

  static Boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
  } 
  
  static int countVowels(String sentence) {
    int count = 0;
    for (int pos = 0; pos < sentence.length(); pos ++) {
      if (isVowel(sentence.charAt(pos)))
        count ++;
    }
    return count;
  }
}