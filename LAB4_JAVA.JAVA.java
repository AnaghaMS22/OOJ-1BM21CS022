import java.util.Scanner;
abstract class shape
{
  int num1; int num2;
  abstract void printarea(int num1 ,int  num2);
      
}
class rectangle extends shape
{
  void printarea(int x, int y)
  {
    int area;
    num1=x;
    num2=y;
    area=num1*num2;
    System.out.println("The area of the rectangle is : "+area);
  }
}

class triangle extends shape
{
  void printarea(int x , int y)
  {
    num1=x;
    num2=y;
    double area;
    area=(0.5)*num1*num2;
    System.out.println("the are of the triangle is : "+area);
  }
}

class circle extends shape
{
  void printarea(int x,int y)
  {
    num1=x;
    num2=y;
    double area;
    area=(3.14)*num1*num2;
    System.out.println("the are of the circle is : "+area);
  }
}

class shape_main
{
  public static void main(String xx[])
  {
    int a,b,r;
    Scanner ss=new Scanner(System.in);
    rectangle r1=new rectangle();
    triangle t1=new triangle();
    circle c1=new circle();
    System.out.println("please enter the length and breadth of rectangle");
    a=ss.nextInt();
    b=ss.nextInt();
    r1.printarea(a,b);
    System.out.println("please enter the base and height of triangle");
    a=ss.nextInt();
    b=ss.nextInt();
    t1.printarea(a,b);
    System.out.println("please enter the radius of circle");
    r=ss.nextInt();
    c1.printarea(r,r);
  }
}
    
    
    
    