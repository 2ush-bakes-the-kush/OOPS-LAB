
import java.util.Scanner;

class EvenNumberException extends Exception{
    String a;
    EvenNumberException(String b){
           a=b;
    }
   @Override
    public String toString(){
        return a;
    }
}
class A3 {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter a number");
          int num = sc.nextInt();
          try{
              if(num%2==0){
                  throw new EvenNumberException("This is Error,It is a Even Number");
              }
          }
        catch (EvenNumberException ex){
         System.out.println(ex);
          }
    }
}