class MMyThread extends Thread
{
    String s;
    int n;
    MMyThread(String s,int n)
    {
        this.s=s;
        this.n=n;
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
                System.out.println(s);
            Thread.sleep(1000);
            System.out.println("End of Thread"+n);            
        }
        catch(InterruptedException e)
        {}

    }
}
public class QQ4 
{
    public static void main(String[] args) 
    {
        MMyThread t1=new MMyThread("MIT",1);
        MMyThread t2=new MMyThread("ICT",2);
        MMyThread t3=new MMyThread("OOP",3);
        t1.setPriority(8);
        t2.setPriority(10);
        t3.setPriority(2);
        t1.start();
        t2.start();
        t3.start();
    }    
}