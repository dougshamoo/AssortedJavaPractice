import java.util.ArrayList;

/*
for (variable declaration : collection-name) {
   set of statements;
}
*/

public class ForEachEx
{
   public static void main(String[] args)
   {
      /*
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for (int i = 1; i < 11; i ++)
         numbers.add(i);
      for(int num : numbers)
         System.out.print(num + " ");
      */
      
      int size = 10;
      int[] nums = new int[size];
      for (int i = 0; i < size; i ++)
         nums[i] = i + 1;
      for (int num : nums)
         System.out.print(num + " ");
   }
}