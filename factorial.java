import java.io.*;

class factorial{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		int num,fact=1,i;
		System.out.print(" Enter a number: ");
		num=Integer.parseInt(br.readLine());
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.print(" Factorial of "+num+" is: " +fact);
	}
}