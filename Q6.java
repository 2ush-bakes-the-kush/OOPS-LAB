
class MyyThread extends Thread
{   
    int n;
    int a[]=new int[5];
    int b[]=new int[5];
    MyyThread(int n)
    {
        this.n=n;
    }
    public void run()
    {
        switch(n)
        {
            case 1:
            {
                int f=0,s=1,t=1;
                a[0]=f;
                a[1]=s;
                for(int i=3;i<=5;i++)
                {
                    t=f+s;
                    a[i-1]=t;
                    f=s;
                    s=t;
                    System.out.print(t);   
                }break;
            }
            case 2:
            {                
                int k=0;
                while(k!=5)
                {
                    for(int i=3;i<7;i++)
                    {
                        int flag=1;
                        for(int j=2;j<i/2;j++)
                            if(i%j==0)
                                flag=0;
                        System.out.print(i);
                        if(flag==1)
                        {                            
                            System.out.print(i);
                            //b[k]=i;
                            k++;
                        } 
                        
                    }
                    k++;
                }
            }
        }
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {
        MyyThread t1=new MyyThread(1);
        MyyThread t2=new MyyThread(2);
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {}
        /*for(int i=0;i<t1.a.length;i++)
            for(int j=0;j<t2.b.length;j++)
                if(t1.a[i]==t2.b[j])
                    System.out.println(t1.a[i]);*/
    }    
}
