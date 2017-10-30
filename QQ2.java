class MyYThread extends Thread
{
    String s;
    MyYThread(String s)
    {
        this.s=s;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(s);
    }
}
public class QQ2 
{
    public static void main(String[] args) 
    {
        MyYThread t1=new MyYThread("MIT");
        MyYThread t2=new MyYThread("ICT");
        MyYThread t3=new MyYThread("OOP");
        t1.start();
        t2.start();
        //t3.start();
    }    
}