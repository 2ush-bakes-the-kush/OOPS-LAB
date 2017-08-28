import java.util.Scanner;

class Number{
    private final double num;
    Number(double a){
        num=a;
    }
    boolean isZero(){
      if(num==0)
          return true;
      else
          return false;
    }
    boolean isPositive(){
        if(num>0)
            return true;
      else
            return false;
    }
    boolean isNegative(){
        if(num<0)
            return true;
      else
            return false;
    }
    boolean isOdd(){
        if(num%2==1)
            return true;
      else
            return false;
    }
    boolean isEven(){
        if(num%2==0)
            return true;
      else
            return false;
    }
    boolean isPrime(){
        for(int i=2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    boolean isArmstrong(){
        int sum=0,copy,r;
        copy=(int)num;
        while(copy>0){
            r=copy%10;
            sum+=(r*r*r);
            copy/=10;
        }
        if(sum==num)
            return true;
        else
            return false;           
    }
}
class NumberMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        double num;
        System.out.print("Enter a number: ");
        num=br.nextDouble();
        Number obj=new Number(num);
        if(obj.isZero())
            System.out.println("The number is Zero");
        else if(obj.isPositive())
            System.out.println("The number is a postive number");
        else if(obj.isNegative())
            System.out.println("The number is a negative number");
        else
            ;
        if(obj.isOdd())
            System.out.println("The number is an odd number");
        else if(obj.isEven())
            System.out.println("The number is a even number");
        else
          ;
        if(obj.isPrime())
            System.out.println("The number is a prime number");
        if(obj.isArmstrong())
            System.out.println("The number is an Armstrong number");
      }
}
