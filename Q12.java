
import java.util.Scanner;
import java.lang.Math;

class Q12 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           int a,root;
           System.out.print("Enter a number to find the square root");
           a=sc.nextInt();
           try{
               if(a<0){
                   throw new NegativeRootException(-a);
               }
           }
           catch(NegativeRootException Ex){
               System.out.println(Ex);
           }
    }
}
class NegativeRootException extends Exception{
    int b;
    NegativeRootException(int x){
        b=x;
    }
    @Override
    public String toString(){
        double a=Math.sqrt(b);
        String ans=a+" I";
        return ans;
    }
}
