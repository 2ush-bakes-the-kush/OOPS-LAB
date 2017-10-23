
import java.util.Scanner;

class Q9 {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        String a,b,m1,m2,m3;
        System.out.print("Enter the name:");
        a=br.next();
        System.out.print("Enter the roll number:");
        b=br.next();
        System.out.print("Enter the marks obtained in three subjects:");
        m1=br.next();
        m2=br.next();
        m3=br.next();
        try{
           int w= Integer.parseInt(b);
           int x= Integer.parseInt(m1);
           int y= Integer.parseInt(m2);
           int z= Integer.parseInt(m3);
        }
        catch(NumberFormatException A){
            System.out.print("Error!!! Enter a number not a string");  
        }
    }
}
