
import java.util.Scanner;

class Rectangle2 {
    public static void main(String[] args){
        Scanner br=new Scanner (System.in);
        int l, b;
        System.out.print("Enter The Length & Breadth: ");
        l=br.nextInt();
        b=br.nextInt();
        System.out.println("Area= "+(l*b));
        System.out.println("Circumference= "+2*(l+b));
    }
}
