import java.util.Scanner;

public class MethodPractice
{
   public static void main(String[] args)
   {
      /* int num = 12;
      System.out.println(num + " squared equals " + square(num)); */

      /* double temp = 0;
      String unit = "";
      Scanner inputTemp = new Scanner(System.in);
      Scanner inputUnit = new Scanner(System.in);         
      System.out.print("Enter unit (f or c): ");
      while (!(unit.equals("f") || unit.equals("c"))) {
         unit = inputUnit.nextLine();
         if (unit.equals("f") || unit.equals("c"))
            break;
         System.out.print("Please enter \"f\" for Farenheit or \"c\" for Celsius: ");
      }
      System.out.print("Enter temperature: ");
      temp = inputTemp.nextDouble();
      if (unit.equals("f"))
         System.out.println(temp + " F equals " + f2c(temp) + " C.");
      else
         System.out.println(temp + " C equals " + c2f(temp) + " F."); */

      double temp = 0;
      String unit = "";
      Scanner inputTemp = new Scanner(System.in);
      Scanner inputUnit = new Scanner(System.in);
      System.out.print("Enter temperature: ");
      temp = inputTemp.nextDouble();
      System.out.print("Enter unit: ");
      unit = inputUnit.nextLine();
      System.out.println("The converted temperature is " + f2c2f(temp, unit));

   }
   
   static int square(int number) {
      return number * number;
   }

   static double c2f(double num) {
      return num * (9/5.0) + 32;
   }
   
   static double f2c(double num) {
      return (num - 32) * (5/9.0);
   } 
   
   static double f2c2f(double num, String unit) {
      if (unit.equals("f"))
         return f2c(num);
      else
         return c2f(num);
   }
}