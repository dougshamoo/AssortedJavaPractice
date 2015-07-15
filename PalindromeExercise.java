import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PalindromeExercise
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String palindrome;
      ArrayList<String> p = new ArrayList<String>();
      System.out.print("Enter word: ");
      palindrome = input.nextLine();
      buildAL(p, palindrome);
      if (isPalindrome(p))
         System.out.println(palindrome + " is a palindrome!");
      else
         System.out.println(palindrome + " is not a palindrome!");
   }

   static void display(ArrayList arr) {
      for (int i = 0; i < arr.size(); i ++)
         System.out.print(arr.get(i));
      System.out.println();
   }

   static void buildAL(ArrayList<String> pword, String word) {
      for (int i = 0; i < word.length(); i ++)
         pword.add(word.charAt(i) + "");
   }
   
   static Boolean isPalindrome(ArrayList<String> word) {
      ArrayList<String> rword = new ArrayList<String>();
      rword.addAll(word);
      Collections.reverse(rword);
      for (int i = 0; i < word.size(); i ++)
          if (!(word.get(i).equals(rword.get(i))))
             return false;
      return true;
   }
}