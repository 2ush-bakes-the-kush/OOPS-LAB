import java.util.Scanner;

class SinXadd2b {
    public static void main(String args[]) { 
        Scanner br=new Scanner(System.in); 
        int n;
        double sum=0;
        System.out.print("Enter the number of terms:");
        n=br.nextInt();
        for(int i=1;i<=n;i++)
            sum=sum+((1/(double)i)*i);
        System.out.print("The Sum is: "+sum); 
    } 
} 
