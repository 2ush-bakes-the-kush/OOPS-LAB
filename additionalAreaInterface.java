import java.util.Scanner;

interface additionalarea{
    abstract double computeArea();
}
class additionaltriangle implements additionalarea{
    double height,base,area;
    additionaltriangle(double a,double b){
        height=a;
        base=b;
    }
    @Override
    public double computeArea(){
        area=0.5*height*base;
        return area;
    }
}
class additionalsquare implements additionalarea{
    double side,area;
    additionalsquare(double a){
        side=a;
    }
    @Override
    public double computeArea(){
        area=side*side;
        return area;
    }
}
class additionalAreaInterface {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        int ch;
        System.out.print("Enter 1 to Compute Area of Triangle and 2 to Compute Area of Square: ");
        ch=br.nextInt();
        if(ch==1){
            double a,b;
            System.out.print("Enter the Height and Base of Triangle: ");
            a=br.nextDouble();
            b=br.nextDouble();
            additionaltriangle obj=new additionaltriangle(a,b);
            System.out.print("Area="+obj.computeArea());
        }
        if(ch==2){
            double a;
            System.out.print("Enter the side of the Square: ");
            a=br.nextDouble();
            additionalsquare obj=new additionalsquare(a);
            System.out.print("Area="+obj.computeArea());
        }
    }
}
