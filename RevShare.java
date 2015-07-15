import java.util.Scanner;

public class RevShare
{
   public static void main(String[] args)
   {
      double rev, percent, share;
      Scanner inputRev = new Scanner(System.in);
      Scanner inputPercent = new Scanner(System.in);
      
      while (true) {
         System.out.print("Enter Monthly Revenue: ");
         rev = inputRev.nextDouble();
         System.out.print("Enter Percent Revenue Share: ");
         percent = inputPercent.nextDouble();
         share = rev * percent;
         System.out.println("Your share is: " + share);
      }
   }
}