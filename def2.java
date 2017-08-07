import java.util.Scanner;

class def2{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
                int a,b,c,d;
                System.out.print("Enter Two Values: ");
                a=br.nextInt();
                b=br.nextInt();
                c=(a << 2) + (b >> 2);
                System.out.println("(a << 2) + (b >> 2)= "+c);
                System.out.println("(b > 0)= "+(b > 0));
                System.out.println("(a + b * 100) / 10= "+(double)(a + b * 100) / 10);
                d=a&b;
                System.out.println("a & b= "+d);
        }
}
