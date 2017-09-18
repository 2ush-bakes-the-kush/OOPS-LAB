import java.util.Scanner;

class Count
{
    static int count=0;
    Count()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Scanner br=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of objects you want to create");
        n=br.nextInt();
        Count obj[]=new Count[n];
        for(int i=0;i<n;i++)
            obj[i]=new Count();
        System.out.println("Number of objects created:"+count);
    }
}

