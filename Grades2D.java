import java.util.Random;

public class Grades2D
{
   public static void main(String[] args)
   {
      final int rows = 3;
      final int cols = 5;
      int total = 0;
      int min = 50;
      int max = 100;
      Random rand = new Random(System.currentTimeMillis());
      int[][] grades = new int[rows][cols];
      for (int r = 0; r < rows; r ++)
         for (int c = 0; c < cols; c ++)
            grades[r][c] = rand.nextInt(max - min + 1) + min;
      displayArr2D(grades, rows, cols, "Student");
      displayAverages2D(grades, rows, cols);
   }

   static void displayArr2D(int[][] arr, int rows, int cols, String rowLabel) {
      for (int r = 0; r < rows; r ++) {
         System.out.print(rowLabel + " " + (r+1) + ": ");
         for (int c = 0; c < cols; c ++)
            System.out.print(arr[r][c] + " ");
      System.out.println();
      }
   }

   static void displayAverages2D(int[][] arr, int rows, int cols) {
      double total = 0.0;
      double average = 0.0;
      for (int r = 0; r < rows; r ++) {
         for (int c = 0; c < cols; c ++)
            total += arr[r][c];
         average = total / cols;
         System.out.println("Average Grade for Student " + (r+1) + ": " + average);
         average = 0.0;
         total = 0.0;
      }
   }
}