class Bank{
    int getRateOfIntrest(){
        return -1;
    }
}
class SBI extends Bank{
    @Override
    int getRateOfIntrest(){
        return 8;
    }
}
class ICICI extends Bank{
    @Override
    int getRateOfIntrest(){
        return 7;
    }
}
class AXIS extends Bank{
    @Override
    int getRateOfIntrest(){
        return 9;
    }
}
class BankMain {
    public static void main(String args[]){
    Bank obj=new Bank();
    SBI obj1=new SBI();
    ICICI obj2=new ICICI();
    AXIS obj3=new AXIS();
    Bank ref;
    ref=obj1;
    System.out.println("The rate of intrest of SBI is :"+ref.getRateOfIntrest());
    ref=obj2;
    System.out.println("The rate of intrest of ICICI is :"+ref.getRateOfIntrest());
    ref=obj3;
    System.out.println("The rate of intrest of AXIS is :"+ref.getRateOfIntrest());
    }
}
