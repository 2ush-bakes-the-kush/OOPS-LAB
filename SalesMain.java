import java.util.Scanner;

interface item{
    void productInfo(String a, String b);
    void sales(double a);
}

class Hardware implements item{
    String category,manufacturer;
    double sales;
    Hardware(){
        category=" ";
        manufacturer=" ";
        sales=0;
    }
    @Override
    public void productInfo(String cat,String man){
        category=cat;
        manufacturer=man;
    }
    @Override
    public void sales(double val){
        sales=val*3;
    }
    void display(){
        System.out.print("Hardware\n"+"\tCategory\t"+"Manufacturer\t"+"Sales for 3 months\n");
        System.out.print("\t"+category+"\t"+ manufacturer+"\t\t"+sales);
    }
}
class Software implements item{
    String type,OS;
    double sales;
    Software(){
        type=" ";
        OS=" ";
        sales=0;
    }
    @Override
    public void productInfo(String t,String o){
        type=t;
        OS=o;
    }
    @Override
    public void sales(double val){
        sales=val*3;   
    }
    void display(){
        System.out.print("Software\n"+"\tType\t"+"Operating System\t"+"Sales for 3 months\n");
        System.out.print("\t"+type+"\t"+ OS+"\t\t"+sales);
    }
}
class SalesMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        String a,b,ch;
        double v;
        System.out.print("Enter 1 for Hardware and 2 for Software");
        ch=br.next();
        if("1".equals(ch)){
            Hardware obj=new Hardware();
            System.out.print("Enter the Category,Manufacturer and monthly Turnover of the Hardware item:");
            a=br.next();
            b=br.next();
            v=br.nextDouble();
            obj.productInfo(a, b);
            obj.sales(v);
            obj.display();
        }
        if("2".equals(ch)){
            Software obj=new Software();
            System.out.print("Enter the Type,Operating System and Monthly Turnover of the Sardware item:");
            a=br.next();
            b=br.next();
            v=br.nextDouble();
            obj.productInfo(a, b);
            obj.sales(v);
            obj.display();
        }
    }
}
