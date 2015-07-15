import java.util.Random;

public class TwoDArrayPractice
{
   public static void main(String[] args)
   {
      Random rand = new Random(System.currentTimeMillis());
      final int rows = 5, cols = 5;
      int[][] numbers = new int[5][5];
      for (int r = 0; r < rows; r ++)
         for (int c = 0; c < cols; c ++)
            numbers[r][c] = rand.nextInt(101);
      displayArr(numbers, rows, cols);
      int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      displayArr(nums, 3, 3);
   }

   static void displayArr(int[][] arr, int rows, int cols) {
      for (int r = 0; r < rows; r ++) {
         for (int c = 0; c < cols; c ++)
            System.out.print(arr[r][c] + " ");
         System.out.println();
      }
   }
}