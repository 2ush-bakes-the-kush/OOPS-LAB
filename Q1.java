
import java.util.Scanner;
public class Q1 {
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        String str, s;
        System.out.println("Enter a string:");
        str=in.nextLine();
        int i,n,j,k,l,count;count=0; k=0; n=0;
        i=str.length();
        for(j=0;j<i;j++)
        {
            if(str.charAt(j)== ' ' || str.charAt(j)== '.' )
                count++;
        }
        for(j=0;j<i;j++)
        {
            if(str.charAt(j)== '.')
                n++;
        }
         System.out.println("The no of characters in the String: "+(i-count));
         System.out.println("The no of lines: "+(n));
         System.out.println("The no of words "+(count));
         for(j=0;j<i;j++)
         {
             if(str.charAt(j)=='a'|| str.charAt(j)=='e'|| str.charAt(j)=='i'|| str.charAt(j)=='o'|| str.charAt(j)=='u' ||str.charAt(j)=='A'||str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U')
              k++;   
         }
         System.out.println("The no of vowels "+k);
    }
    
}