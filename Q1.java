
class  Q
 {     
    int  n;
    boolean   valueSet = false;
    synchronized  int  get() 
    {	
        if(!valueSet)
	try
	{     
            wait();     
        }
	catch(InterruptedException   e) 
	{      
            System.out.println("Exception ");     
        }   
            System.out.println("Got: " + n);
            valueSet = false;
            notify();
            return  n;
    }
    synchronized  void  put(int   n) 
    {      
        if(valueSet)
	try
	{        
            wait();     
        }
        catch(InterruptedException   e) 
	{        
            System.out.println("Exception");    
        }        
            this.n = n;
            valueSet = true;
            System.out.println("Put: " + n);
            notify();
    } 
}
class  Producer  implements   Runnable 
{
    Q   q;
    Producer(Q  q) 
    {
	this.q = q;
	new  Thread(this, "Producer").start();
    }   
    @Override
    public  void  run() 
    {
	int   i = 0;
	while(true && i<6)
            q.put(i++);
    }
}
class  Consumer  implements  Runnable 
{
    Q   q;
    Consumer(Q   q) 
    {
	this.q = q;
	new  Thread(this, "Consumer").start();
    }
    public   void   run() 
    {
	while(true) 
            q.get();
	
    }
}
public class Q1 
{
    public static void main(String[] args) 
    {
        Q   q = new   Q();
        Producer producer = new   Producer(q);
        Consumer consumer = new   Consumer(q);
    }    
}
