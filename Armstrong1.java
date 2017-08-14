
import java.util.Scanner;

class Armstrong1 {
    public static void main(String[] args){
        Scanner br=new Scanner(System.in);
        int r,n,copy,sum=0;
        System.out.print("Enter the number to be checked: ");
        n=br.nextInt();
        copy=n;
         while(n!=0){
             r=n%10;
             sum=sum+(r*r*r);
             n=n/10;
         }
         if(sum==copy)
             System.out.println(copy+" is an armstrong number.");
         else
             System.out.println(copy+" is not an armstrong number.");
    }
}
