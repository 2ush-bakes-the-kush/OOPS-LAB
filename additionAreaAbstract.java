import java.util.Scanner;

abstract class additionalArea{
    double area;
    abstract double computeArea();
}
class Triangle extends Area{
    double base,height;
    Triangle(double a,double b){
        base=a;
        height=b;
    }
    @Override
    double computeArea(){
        this.area=0.5*base*height;
        return this.area;
    }
}
class Square extends Area{
    double side;
    Square(double a){
        side=a;
    }
    @Override
    double computeArea(){
        this.area=side*side;
        return this.area;
    }
}
class additionAreaAbstract {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        int ch;
        System.out.print("Enter 1 to Compute Area of Triangle and 2 to Compute Area of Square: ");
        ch=br.nextInt();
        if(ch==1){
            double a,b;
            System.out.print("Enter the Base and Height of the Triangle: ");
            a=br.nextDouble();
            b=br.nextDouble();
            Triangle obj=new Triangle(a,b);
            System.out.print("Area="+obj.computeArea());
        }
        if(ch==2){
            double a;
            System.out.print("Enter the Radius of the Square: ");
            a=br.nextDouble();
            Square obj=new Square(a);
            System.out.print("Area="+obj.computeArea());
        }
    }
}

