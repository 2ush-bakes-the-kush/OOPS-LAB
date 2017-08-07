import java.util.Scanner;

class conversions{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
                int a,in1,in2;
                double b;
                char c;
                byte by1,by2;
                System.out.print("Enter an Integer Number: ");
                a=br.nextInt();
                System.out.print("Enter a Decimal Number: ");     
                b=br.nextDouble();
                System.out.print("Enter a Charecter: ");     
                c=br.next().charAt(0);
                by1=(byte) a;
                in1=(int) c;
                by2=(byte) b;
                in2=(int) b;
                System.out.println("Int to Byte   Char to Int   Double to Byte   Double to Int");
                System.out.println(by1+"\t\t"+in1+"\t\t"+by2+"\t\t"+in2);
        }
}
                
