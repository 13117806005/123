public class Circle extends Shape{
   final public double PI = 3.14159;
   private double radius;
   public void setRadius(double radius)
   {
   this.radius = radius;
   }
   public double getRadius()
  {
  return radius;
   }
   public Circle(String color, double radius)
   {
    super(color);
    this.radius = radius;
    }
   public double calPerimeter()
   {
   return 2 * PI * radius; 
   }
   public String getType()
   {  
   return "Ô²ÐÎ";
   }
   public static void main(String[] args)
   {
    Shape s1 = new Triangle("ºÚÉ«", 3, 4, 5);
    Shape s2 = new Circle("ºìÉ«", 5);
    System.out.println(s1.calPerimeter() + " " + s1.getType());
    System.out.println(s2.calPerimeter() + " " + s2.getType());
    }

}