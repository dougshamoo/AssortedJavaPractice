public abstract class Shape
{
   private int x;
   private int y;

   Shape(int xcor, int ycor) {
      x = xcor;
      y = ycor;
   }

   public int getX() {
      return x;
   }
 
   public int getY() {
      return y;
   }

   public void setX(int newX) {
      x = newX;
   }

   public void setY(int newY) {
      y = newY;
   }

   public void set(int newX, int newY) {
      x = newX;
      y = newY;
   }
 
   public void move(int x1, int y1) { 
      set(getX() + x1, getY() + y1);
   }

   public abstract void draw();
}