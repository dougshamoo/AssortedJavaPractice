public class ArrayPractice
{
   public static void main(String[] args)
   {
      /* int[] numbers = new int[10];
      char[] letters = new char[20];
      int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      String[] names = {"Jane", "Joe", "Mary", "Bob"); */

      final int size = 10;
      int[] numbers = new int[size];
      for (int i = 0; i < size; i ++)
         numbers[i] = i + 1;
      for (int i = 0; i < size; i ++)
         System.out.print(numbers[i] + " ");

      int total = 0;
      for (int i = 0; i < size; i ++)
         total += numbers[i];
      System.out.println("Total: " + total);
   }
}