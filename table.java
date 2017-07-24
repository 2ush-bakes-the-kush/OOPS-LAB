import java.io.*;

class table{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		int num,i;
		System.out.print(" Enter a number: ");
		num=Integer.parseInt(br.readLine());
		for(i=1;i<=12;i++){
			System.out.println(num+ " X "+i+" = " +(num*i));
		}
	}
}