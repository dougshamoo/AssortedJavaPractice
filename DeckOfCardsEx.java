import java.util.Random;

public class DeckOfCardsEx
{
   public static void main(String[] args)
   {
      final int rows = 4;
      final int cols = 13;
      int[][] deck = new int[rows][cols];
      initDeck(deck, rows, cols);
      shuffleDeck(deck, rows, cols);
      displayDeck(deck, rows, cols);
   }

   static void initDeck(int[][] deck, int rows, int cols) {
      for (int r = 0; r < rows; r ++)
         for (int c = 0; c < cols; c ++)
            deck[r][c] = 0;
   }

   static void displayDeck(int[][] deck, int rows, int cols) {
      for (int r = 0; r < rows; r ++) {
         for (int c = 0; c < cols; c ++)
            System.out.print(deck[r][c] + " ");
         System.out.println();
      }
   }

   static void shuffleDeck(int[][] deck, int rows, int cols) {
      Random rand = new Random(System.currentTimeMillis());
      int row, col;
      for (int card = 1; card<= 52; card ++) {
         row = rand.nextInt(rows);
         col = rand.nextInt(cols);
         if (deck[row][col] == 0)
            deck[row][col] = card;
         else {
            while (deck[row][col] != 0 ) {
               row = rand.nextInt(rows);
               col = rand.nextInt(cols);
            }
            deck[row][col] = card;
         }
      }
   }
}