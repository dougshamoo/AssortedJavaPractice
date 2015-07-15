import java.util.ArrayList;

public class ArrayListInit
{
   public static void main(String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      ArrayList<Double> nums = new ArrayList<Double>();

      names.add("Bob");
      names.add("Jane");
      System.out.println(names + " size:" + names.size());

      for (int i = 0; i < 10; i ++)
         numbers.add(i);
      System.out.println(numbers + " size:" + numbers.size());
      
      nums.add(5.5);
      System.out.println(nums + " size:" + nums.size());

      for (int i = 0; i < 10; i ++)
          System.out.println(numbers.get(i));
   }
}