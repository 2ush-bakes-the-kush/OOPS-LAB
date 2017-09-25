import java.util.Scanner;

interface area{
    abstract double computeArea();
}
class rectangle implements area{
    double length,breadth,area;
    rectangle(double a,double b){
        length=a;
        breadth=b;
    }
    @Override
    public double computeArea(){
        area=length*breadth;
        return area;
    }
}
class circle implements area{
    double radius,area;
    circle(double a){
        radius=a;
    }
    @Override
    public double computeArea(){
        area=3.14*radius*radius;
        return area;
    }
}
class AreaInterface {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        int ch;
        System.out.print("Enter 1 to Compute Area of Rectangle and 2 to Compute Area of Circle: ");
        ch=br.nextInt();
        if(ch==1){
            double a,b;
            System.out.print("Enter the Length and Breadth of the Rectangle: ");
            a=br.nextDouble();
            b=br.nextDouble();
            rectangle obj=new rectangle(a,b);
            System.out.print("Area="+obj.computeArea());
        }
        if(ch==2){
            double a;
            System.out.print("Enter the Radius of the Circle: ");
            a=br.nextDouble();
            circle obj=new circle(a);
            System.out.print("Area="+obj.computeArea());
        }
    }
}


