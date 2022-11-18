import java.util.Scanner;
class quad
{
  public static void main(String xx[])
  {
    int a; int b;int c;
    double d;
    double r1,r2;
    Scanner s1=new Scanner(System.in);
    System.out.println("enter the values of a,b,c");
    a=s1.nextInt();
    b=s1.nextInt();
    c=s1.nextInt();
    d=b*b-(4*a*c);
    if(a==0)
    {
      System.out.println("the equation is not quadratic");
    }
    else if(d==0)
    {
      System.out.println("the roots are real and equal");
      r1=-b/(2*a);
      System.out.println(r1);
    }
    else if (d>0)
    {
      System.out.println("the roots are real and distinct");
      r1=(-b+Math.sqrt(d))/(2*a);
      r2=(-b-Math.sqrt(d))/(2*a);
      System.out.println(r1+", "+r2);
    }
    else
    {
      System.out.println("the roots are imaginary");
      r1=-b/(2*a);
      r2=Math.sqrt(Math.abs(d));
      System.out.println("the roots are"+" "+r1+"+"+"i"+"*"+Math.sqrt(r2)+"and"+r1+"-"+"i"+"*"+Math.sqrt(r2));
    }
  }
}

      
  
    

    