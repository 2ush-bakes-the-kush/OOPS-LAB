import java.io.*;

class palindrome{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		int num,n,p,z=0;
		System.out.print(" Enter a number: ");
		num=Integer.parseInt(br.readLine());
		n=num;
		while(n>0){
			p=n%10;
			z=z*10+p;
			n=n/10;
		}
		if(z==num)
			System.out.print("The Number Entered is a Palindrome Number");
		else
			System.out.print("The Number Entered is not a Palindrome Number");
	}
}
			