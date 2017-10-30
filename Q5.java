
class MyThreadd extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<100;i++)
                System.out.println("MIT");
            Thread.sleep(1000);
            System.out.println("End of Thread");
        }
        catch(InterruptedException e)
        {
            System.out.println("Caught: "+e);
        }
    }
}
public class Q5 
{
    public static void main(String[] args) 
    {
        MyThreadd t=new MyThreadd();
        t.start();        
        for(int i=0;i<150;i++)
            System.out.println("ICT");
        System.out.println("End of Main Thread");        
    }    
}
