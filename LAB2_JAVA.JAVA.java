import java.util.Scanner;
class student
{
  String name,usn;
  int marks[]=new int[5];
  int credits[]=new int[5];
  void input()
  {
    Scanner ss=new Scanner(System.in);
    System.out.println("Enter your name :");
    name=ss.next();
    System.out.println("Enter your usn:");
    usn=ss.next();
    System.out.println("enter the marks of each subject:");
    for(int i=0;i<5;i++)
    {
      marks[i]=ss.nextInt();
    }
    System.out.println("enetr the number of credits of each subject: ");
    for(int i=0;i<5;i++)
    {
      credits[i]=ss.nextInt();
    }
  }
  void display()
  {
    System.out.println("NAME :"+name);
    System.out.println("USN :"+usn);
    for(int i=0;i<5;i++)
    {
      System.out.println("Marks of each subject is"+marks[i]);
      System.out.println("number of credits for each subject"+(i+1)+"= "+credits[i]);
    }
  }
  void calc()
  {
    int gr_point[]=new int[5];
    int sgpa=0;
    int sum=0; float res;
    for(int i=0;i<5;i++)
    {
      if(marks[i]>=90)
      {
        gr_point[i]=10;
      }
      else  if(marks[i]>=80 )
      {
        gr_point[i]=9;
      }
      else if(marks[i]>=70)
      {
        gr_point[i]=8;
      }
      else if(marks[i]>=60)
      {
        gr_point[i]=7;
      }
      else if(marks[i]>=50)
      {
        gr_point[i]=6;
      }
      else if(marks[i]>=40)
      {
        gr_point[i]=5;
      }
      else if(marks[i]>=35)
      {
        gr_point[i]=4;
      }
      else if(marks[i]<35 && marks[i]>0)
      {
        gr_point[i]=0;
      }
      else
      {
        System.out.println("nvalid marks for subjects");
      }
    }
    for(int i=0;i<5;i++)
    {
      sgpa+=(gr_point[i]*credits[i]);
      sum+=credits[i];
    }
    res=(float) sgpa/sum;
    System.out.println("sgpa= "+res);
  }
}
class sgpa
{
  public static void main(String xx[])
  {
    student s1=new student();
    s1.input();
    s1.display();
    s1.calc();
  }
}
