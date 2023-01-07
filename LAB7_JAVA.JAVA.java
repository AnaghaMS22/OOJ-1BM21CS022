import java.util.Scanner;

class Bms extends Thread 
{
   synchronized public void run() 
    {
        try
        {
            int i=0;
            for(i=0;i<5;i++)
            {
            sleep(10000);
            System.out.println("BMS college of engineering ");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Thread interrupted");
        }
    }
}

class Cse extends Thread 
{
    synchronized public void run()
    {
        try 
        {
        int i=0;
        for(i=0;i<10;i++)
        {
        sleep(2000);
        System.out.println("CSE");
        }
        } 
        catch (Exception e) 
        {
            System.out.println("Thread interrupted");
        }
    }
}


class Main
{
public static void main(String args[]) 
{
Bms b1 = new Bms();
Cse c1 = new Cse();
b1.start();
c1.start();
}
}