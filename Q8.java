
import java.util.Scanner;

class Q8 {
     public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter The position you want to enter the value at:");
        int p=br.nextInt();
        try{
            System.out.print("Enter the number:");
             a[p]=br.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds Error");
      }
   }
}