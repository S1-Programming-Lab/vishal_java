import java.util.Scanner;
public class shapes
{
  void area(int r1)
  {
    double area=3.14*r1*r1;
    System.out.println("Area of circle is radius" + r1+"="+area);
  }
  void area(int a1,int b1)
  {
    int area=a1*b1;
    System.out.println("Area of rectangle is with dimensions" + a1+"X"+b1+"="+area);
  }
  void area(int a1,int b1,int c1)
  {
    int area=a1*b1*c1;
    System.out.println("Area of cuboid is with dimensions" + a1+"X"+b1+"X"+c1+"="+area);
  }
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the length");
 int l=sc.nextInt();
 System.out.println("Enter the breadth");
 int b=sc.nextInt();
 System.out.println("Enter the height");
 int h=sc.nextInt();
 System.out.println("Enter the radius");
 int r=sc.nextInt();
 shapes s=new shapes();
 s.area(r);
 s.area(l,b);
 s.area(l,b,h);
}
}
