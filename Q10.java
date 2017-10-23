
import java.util.Scanner;

class NegativeAgeException extends Exception{
    String a;
    NegativeAgeException(String b){
           a=b;
    }
   @Override
    public String toString(){
        return a;
    }
}
class Q10 {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Your Age");
          int age = sc.nextInt();
          try{
              if(age < 0){
                  throw new NegativeAgeException("This is Error, age cannot be negative");
              }
          }
        catch(NegativeAgeException ex){
         System.out.println(ex);
          }
    }
}

