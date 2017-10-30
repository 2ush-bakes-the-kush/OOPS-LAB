class Matrix
{
    synchronized int sum(int a[][],int n)
    {
        int sum=0;
        for(int j=0;j<3;j++)
            sum+=a[n][j];
        System.out.println("Sum of Row"+n+": "+sum);
        return sum;
    }
    public void count(int i)
    {
        synchronized(this)
        {
            for(int j=0;j<=i;j++)
                System.out.println("Thread:"+(i+1)+" "+j);
        }
    }
}
class MyThreaAd extends Thread
{
    Matrix m;
    int rs;
    int i,a[][];
    MyThreaAd(int i,Matrix m,int a[][])
    {
        this.m=m;
        this.a=a;
        this.i=i;
    }
    public void run()
    {
           rs=m.sum(a,i);
           m.count(i);
        
    }
}
public class QQ5 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        Matrix ma=new Matrix();
        MyThreaAd t1=new MyThreaAd(0,ma,a);
        MyThreaAd t2=new MyThreaAd(1,ma,a);
        MyThreaAd t3=new MyThreaAd(2,ma,a);
        t1.start();
        t2.start();
        t3.start();
    }    
}