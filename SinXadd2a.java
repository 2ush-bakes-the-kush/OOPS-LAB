import java.lang.Math.*;
import java.util.Scanner;

class SinXadd2a { 
    static double fact(int n){ 
        int fact=1; 
        for(int i=1;i<=n;i++){ 
            fact=fact*i; 
        } 
        return (fact); 
    } 
    public static void main(String args[]) { 
        Scanner br=new Scanner(System.in); 
        int x,n;
        double sum=0;
        System.out.print("Enter the value of x and the number of terms:");
        x=br.nextInt();
        n=br.nextInt();
        for(int i=0;i<n;i++)
            sum+=(double)Math.pow(-1,i)*(Math.pow(x,2*i+1))/fact(2*i+1); 
        System.out.print("The Sum is: "+sum); 
    } 
} 

