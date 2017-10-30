class MyThreadD extends Thread
{
    String s;
    int n;
    MyThreadD(String s,int n)
    {
        this.s=s;        
        this.n=n;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(s);
        System.out.println("End of Thread"+n);
    }
}
public class QQ3 
{
    public static void main(String[] args) 
    {
        MyThreadD t1=new MyThreadD("MIT",1);
        MyThreadD t2=new MyThreadD("ICT",2);
        t1.start();
        t2.start();
        System.out.println("Thread1: "+t1.isAlive());
        System.out.println("Thread2: "+t2.isAlive());
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {}
        System.out.println("End of Main Thread");            
    }    
}