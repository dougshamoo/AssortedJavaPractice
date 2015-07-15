import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class LanguageMismatch
{
   public static void main(String[] args) throws FileNotFoundException {
      String englishPath = "C:\\Users\\dougs_000\\java\\englishPack.txt";
      String chinesePath = "C:\\Users\\dougs_000\\java\\chinesePack.txt";
      Scanner englishScanner = new Scanner(new File(englishPath));
      Scanner chineseScanner = new Scanner(new File(chinesePath));
      ArrayList<String> chinese = new ArrayList<String>();
      ArrayList<String> english = new ArrayList<String>();
      ArrayList<Integer> lines = new ArrayList<Integer>();
      ArrayList<Integer> misorderedLines = new ArrayList<Integer>();
      
      while (englishScanner.hasNextLine()) {
         english.add(englishScanner.nextLine());
      }
      System.out.println("English pack loaded");
      
      while (chineseScanner.hasNextLine()) {
         chinese.add(chineseScanner.nextLine());
      }
      System.out.println("Chinese pack loaded.");

      System.out.println("english size: " + english.size());
      System.out.println("chinese size: " + chinese.size());

      System.out.println("%: " + findDiffLines("%", chinese, english));
      System.out.println("%s: " + findDiffLines("%s", chinese, english));
      System.out.println("%d: " + findDiffLines("%d", chinese, english));

      for (int line = 0; line < chinese.size(); line ++) {
         if (chinese.get(line).contains("%s") && chinese.get(line).contains("%d")) {
            if (!(substringOrder("%s", "%d", chinese.get(line)).equals(substringOrder("%s", "%d", english.get(line))))) {
               misorderedLines.add(line + 1);
            }
         }
      }
      System.out.println(misorderedLines);

      /* for (int line = 0; line < english.size(); line ++) {
         if (chinese.get(line).contains("%")) {
            if (!(chinese.get(line).length() - chinese.get(line).replace("%", "").length() == english.get(line).length() - english.get(line).replace("%", "").length())) {
               lines.add(line);
            }
         }
      }
      
      for (int i = 0; i < lines.size(); i ++) {
         System.out.println("Line: " + lines.get(i));
         System.out.println(chinese.get(lines.get(i)));
         System.out.println(english.get(lines.get(i))); 
      } */
   }
   
   static ArrayList<Integer> findDiffLines(String sub, ArrayList<String> pack1, ArrayList<String> pack2) {
      ArrayList<Integer> diffLines = new ArrayList<Integer>();
      for (int line = 0; line < pack1.size(); line ++) {
         if (pack1.get(line).contains(sub)) {
            if (!(pack1.get(line).length() - pack1.get(line).replace(sub, "").length() == pack2.get(line).length() - pack2.get(line).replace(sub, "").length())) {
               diffLines.add(line + 1);
            }
         }
      }
      return diffLines;
   }

   static String substringOrder(String sub1, String sub2, String line) {
      String substringOrder = "";
      int index = 0;
      if (line.indexOf(sub1) < line.indexOf(sub2)) {
         index = line.indexOf(sub1);
         substringOrder += sub1;
      }
      else {
         index = line.indexOf(sub2);
         substringOrder += sub2;
      }
      while (index >= 0 && index < line.length())
          if (line.indexOf(sub1, index + sub1.length()) < line.indexOf(sub2, index + sub2.length())) {
             substringOrder += sub1;
             index = line.indexOf(sub1, index + sub1.length());
          }
          else {
             substringOrder += sub2;
             index = line.indexOf(sub2, index + sub2.length());
          }
      return substringOrder;
   }
}