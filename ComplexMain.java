import java.util.Scanner;

class Complex{
    double sumR, sumI;
    Complex(){
        sumR=0;
        sumI=0;
    }
    void add(double a,double x,double y){
        sumR=a+x;
        System.out.print("The Sum is= "+sumR+" + "+y+" i ");
    }
    void add(double p, double q, double x, double y){
        sumR=p+x;
        sumI=q+y;
        System.out.print("The Sum is= "+sumR+" + "+sumI+" i ");
    }
}
class ComplexMain 
{
	public static void main(String args[]){
            Scanner br=new Scanner (System.in);
            Complex obj=new Complex();
            double a,b,c,d;
            int ch=0;
            System.out.print("Enter 1 for real and complex addition and 2 for complex and complex addition: ");
            ch=br.nextInt();
            if(ch==1){
            	System.out.print("Enter the real number and then the real and imaginary part of the complex number: ");
                a=br.nextDouble();
                c=br.nextDouble();
                d=br.nextDouble();
                obj.add(a, c, d);
        	}
            else if(ch==2){
            	System.out.print("Enter the real and imaginary part of the two complex number respectively: ");
                a=br.nextDouble();
                b=br.nextDouble();
                c=br.nextDouble();
                d=br.nextDouble();
                obj.add(a, b, c, d);
            }
    	}
}
