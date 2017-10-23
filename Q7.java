import java.util.Scanner;

class Q7 {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        System.out.print("Enter a number:");
        String a=br.next();
        
        try{
           int b= Integer.parseInt(a);
           System.out.println(b);
        }
        catch(NumberFormatException A){
            System.out.print("Error");
        }
    }
}
