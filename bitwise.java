import java.util.Scanner;

class bitwise{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
                int num,mul,div;
                System.out.print("Enter a number: ");
                num=br.nextInt();
                div=num>>1;
                mul=num<<1;
                System.out.println("Multiply by 2 = "+mul);
                System.out.println("Divide   by 2 = "+div);              
        }
}