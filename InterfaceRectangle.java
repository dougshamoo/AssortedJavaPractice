public class InterfaceRectangle implements ShapeInterface
{
   private int x, y, width, height;
   
   InterfaceRectangle(int xcor, int ycor, int w, int h) {
      x = xcor;
      y = ycor;
      width = w;
      height = h;
   }

   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   public void setX(int xcor) {
      x = xcor;
   }
   
   public void setY(int ycor) {
      y = ycor;
   }
   
   public void draw() {
      System.out.println("Drawing your stupid rectangle");
   }
}