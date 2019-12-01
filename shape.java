public interface Shape {
double getArea();
}

public class Rectangle implements Shape { 
   private double length;
   private double width;

public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

@Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }

@Override
   public double getArea() {
      return length * width;
   }
}

public class Triangle implements Shape {
   private double base;
   private double height;

   public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
   }

   @Override
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }

   @Override
   public double getArea() {
      return 0.5 * base * height;
   }
}
