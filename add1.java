import java.util.Scanner;

class add1{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[]=new int[10];
		int i,n,c=0,j;
		System.out.println("Enter the size of the array: ");
		n=br.nextInt();
		System.out.println("Enter the elements of the array:" );
		for(i=0;i<n;i++)
			a[i]=br.nextInt();
		for(i=0;i<n;i++){
			c=0;
			for(j=2;j<=a[i];j++){
				if(a[i]%j==0){
					c=1;
					break;
				}
			}
			if(c==0)
				System.out.print(a[i]+" ");
		}
	}
}