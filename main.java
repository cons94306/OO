abstact class CShape
{
 protected String color;
 public void setColor(String str)
  {
    color = str;
  }
  public abstract void show();
}

class CTriangle extend CShape
{
protected doble a,b,c;
public CTriangle(double a,double b,double c)
  {
   this.a = a;
   this.b = b;
   this.c = c;
  }
public void show()
  {
    System.out.print("Color = " + color + ", ")
    System.out.println(" area = " 0.5*a*b }
}

public class app11_1
{
 public static void main(String args[])
   {
       CRectangle rect = new CRectangle(3,4,5);
       rect.setColor("Red");
       rect.show();
   }
}
