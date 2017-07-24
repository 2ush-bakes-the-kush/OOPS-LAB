import java.io.*;

class numbers{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		int i,num,n=0,p=0,z=0;
		System.out.println(" Enter  Ten Numbers: ");
		for(i=0;i<10;i++){
			num=Integer.parseInt(br.readLine());
			if(num>0)
				p++;
			else if (num<0)
				n++;
			else
				z++;
			}
		System.out.println("There are "+p+" npositive numbers.");
		System.out.println("There are "+n+" negative numbers.");
		System.out.println("There are "+z+" zeros");
			
		}
	}