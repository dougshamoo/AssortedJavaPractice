import java.util.ArrayList;
import java.util.Random;

public class ArraySearch
{
   public static void main(String[] args)
   {
      int numNums = 100;
      Random rand = new Random(System.currentTimeMillis());
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for (int i = 0; i < numNums; i ++)
         numbers.add(rand.nextInt(101));
      
      /*if (numbers.indexOf(100) >= 0)
         System.out.println("100 was found at position " + numbers.indexOf(100));
      else
         System.out.println("100 not found in array");*/

      System.out.println("The min is located at index " + min(numbers)
                          + " and has value " + numbers.get(min(numbers)));
   }

   static int min(ArrayList<Integer> arr) {
      int minIdx = 0;
      for (int i = 0; i < arr.size(); i ++) {
         if (arr.get(i) > arr.get(minIdx))
            minIdx = i;
         }
      return minIdx;
   } 
}