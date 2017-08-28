import java.util.Scanner;

import java.lang.Math.*;

class Account{
    String name,ac,type;
    double balance;
    Account(String a, String b,String c,double bal){
        name=a;
        ac=b;
        type=c;
        balance=bal;
    }
    void Display(){
        System.out.println("Your updated balance is: Rs"+balance);
    }
    void Withdraw(double money){
        balance-=money;
    }
}
class savingAC extends Account{
        savingAC(String a, String b, String c,double bal,double w){
             super(a, b, c,bal);
             super.Withdraw(w);
             super.Display();
        }
        void intrest(){
            double intr=super.balance*Math.pow((1+12.5/100),1)-balance;
            balance+=intr;
            System.out.println("Your Intrest is: Rs"+intr);
            super.Display();
        }
   }

class currentAC extends Account{
        currentAC(String a, String b, String c,double bal,double w){
        super(a, b, c,bal);
        super.Withdraw(w);
        super.Display();
    }
       void minimum(){
           double  tax;
           if(balance<5000){
              tax=12.5/100*5000;
              System.out.println("Your balance is below the minimum limit of Rs 5000 you are charged a serrvice tax of Rs:"+tax);
              balance-=tax;
              super.Display();
           }      
       }
}
class AccountMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        String n,a,c,ch;
        double b,w=0;
        System.out.print("Enter the name,AC number,type and balance of your account: ");
        n=br.nextLine();
        a=br.nextLine();
        c=br.nextLine();
        b=br.nextDouble();
        System.out.print("Do you want to withdraw money(Yes or No): ");
        ch=br.next();
        if(ch.equalsIgnoreCase("Yes")){
            System.out.print("Enter the amount you want to withdraw: Rs");
            w=br.nextDouble();
        }
        if(c.equalsIgnoreCase("Saving")){
            savingAC obj=new savingAC(n,a,c,b,w);
            obj.intrest();
        }
        else if(c.equalsIgnoreCase("Current")){
            currentAC obj=new currentAC(n,a,c,b,w);
            obj.minimum();
        }
    }
}
