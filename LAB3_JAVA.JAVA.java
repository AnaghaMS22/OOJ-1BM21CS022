import java.util.Scanner;
class book
{
  String name,author;
  double price;
  int num_pages;
  book()
  {
    name=" "; 
    author=" ";
    num_pages=0;
    price=0;
  }
  void input()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the name of the book :");
    name=s.next();
    System.out.println("enter the author's name :");
    author=s.next();
    System.out.println("enter the price of the book :");
    price=s.nextDouble();
    System.out.println("enter the no of pages of the book :");
    num_pages=s.nextInt();
  }
  public String toString()
  {
    return("Name :"+name+" "+"Author :"+author+" "+"Price: "+price+" "+"number of pages: "+num_pages);
  }
}
class book_main
{
  public static void main(String xx[])
  {
    System.out.println("enter the no of books :");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    book books[]=new book[n];
    for(int i=0;i<n;i++)
    {
      books[i]=new book();
      books[i].input();
      System.out.println("\nBook Details");
      System.out.println(books[i]);
    }
  }
}