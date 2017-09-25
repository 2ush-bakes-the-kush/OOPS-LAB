import java.util.Scanner;

abstract class Area{
    double area;
    abstract double computeArea();
}
class Rectangle extends Area{
    double length,breadth;
    Rectangle(double a,double b){
        length=a;
        breadth=b;
    }
    @Override
    double computeArea(){
        this.area=length*breadth;
        return this.area;
    }
}
class Circle extends Area{
    double radius;
    Circle(double a){
        radius=a;
    }
    @Override
    double computeArea(){
        this.area=3.14*radius*radius;
        return this.area;
    }
}
class AreaAbstract {
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
            Rectangle obj=new Rectangle(a,b);
            System.out.print("Area="+obj.computeArea());
        }
        if(ch==2){
            double a;
            System.out.print("Enter the Radius of the Circle: ");
            a=br.nextDouble();
            Circle obj=new Circle(a);
            System.out.print("Area="+obj.computeArea());
        }
    }
}

