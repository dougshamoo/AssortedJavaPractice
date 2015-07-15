import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList
{
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = randIntList(10, 100);
      display(numbers);
      Collections.sort(numbers);
      display(numbers);
   }

   static ArrayList<Integer> randIntList(int numInts, int maxInt) {
      int number;
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      Random rand = new Random(System.currentTimeMillis());
      for (int i = 0; i < numInts; i ++) {
          number = rand.nextInt(maxInt + 1);
          numbers.add(number);
      }
      return numbers;
   }

   static void display(ArrayList arr) {
      for (int i = 0; i < arr.size(); i ++)
         System.out.print(arr.get(i) + " ");
      System.out.println();
   }

}