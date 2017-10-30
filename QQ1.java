import java.util.Scanner;
class MyThread1 implements Runnable
{
    public void run()
    {
        System.out.println("Runnable interface");
        for(int i=0;i<5;i++)
            System.out.println("MIT");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread class");
        for(int i=0;i<5;i++)
            System.out.println("ICT");
    }
}
public class QQ1 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        MyThread1 t=new MyThread1();
        MyThread2 t2=new MyThread2();
        Thread t1=new Thread(t);
        System.out.println("1.Runnable interface 2.Thread class :");
        int op=in.nextInt();
        switch(op)
        {
            case 1:t1.start();break;
            case 2:t2.start();break;
            default:System.out.println("Invalid choice");
        }
    }    
}