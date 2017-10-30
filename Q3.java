
public class Q3 
{
    public static void main(String[] args) 
    {
        Thread t=Thread.currentThread();
        System.out.println("Name of the Thread: "+t.getName());
        t.setName("Thread A");
        System.out.println("Changed name of the Thread: "+t.getName());
    }    
}

