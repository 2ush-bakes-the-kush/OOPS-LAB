class Table
{
    synchronized void tab(int n)
    {
        System.out.println(n+" Table");
        for(int i=1;i<4;i++)
            System.out.println(n+" * "+i+ " = "+(n*i));
    }
}
class MyThread extends Thread
{
    Table t;
    int n;
    MyThread(int n,Table t)
    {
        this.n=n;
        this.t=t;
    }
    public void run()
    {
        t.tab(n);
    }
}
public class Q2 
{
    public static void main(String[] args) 
    {
        Table t=new Table();
        MyThread t1=new MyThread(5,t);
        MyThread t2=new MyThread(7,t);
        MyThread t3=new MyThread(13,t);
        t1.start();
        t2.start();
        t3.start();
    }    
}
