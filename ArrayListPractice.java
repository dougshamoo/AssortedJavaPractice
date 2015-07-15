import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice
{
   public static void main(String[] args)
   {
      double average;
      int total = 0, numGrades, grade;
      Scanner inputNumGrades = new Scanner(System.in);
      Scanner inputGrade = new Scanner(System.in);
      ArrayList<Integer> grades = new ArrayList<Integer>();
   
      System.out.print("Please enter the number of grades: ");
      numGrades = inputNumGrades.nextInt();
   
      for (int count = 0; count < numGrades; count ++) {
         System.out.print("Enter grade " + (count + 1) + ": ");
         grade = inputGrade.nextInt();
         grades.add(grade);
      }
      
      display(grades);
      System.out.println("The average is " + average(grades));
      change(grades, 5);
      display(grades);
      System.out.println("The average is " + average(grades));

      /* for (int i = 0; i < grades.size(); i ++)
         total += grades.get(i);
      average = total / grades.size();
      System.out.println("The average is " + average); */
   }
   
   static double average(ArrayList<Integer> numbers) {
      double total = 0.0;
      for (int i=0; i < numbers.size(); i ++)
         total += numbers.get(i);
      return total / numbers.size();
   }
   
   static void display(ArrayList arr) {
      for (int i=0; i < arr.size(); i ++)
         System.out.print(arr.get(i) + " ");
      System.out.println();
   }

   static void change(ArrayList<Integer> arr, int amount) {
      int value;
      for (int i = 0; i < arr.size(); i ++) {
         value = arr.get(i);
         arr.set(i, value + amount);
      }
   }
}