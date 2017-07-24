import java.io.*;

class area{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		int len=0,bre=0;
		System.out.print(" Enter  The Length:  ");
		len=Integer.parseInt(br.readLine());
		System.out.print("Enter The Breadth:  ");
		bre=Integer.parseInt(br.readLine());
		System.out.println("The Area Computed is: "+(len*bre));
		System.out.println("The Circumference Computed is: "+ (2*(len+bre)));
	}
}

