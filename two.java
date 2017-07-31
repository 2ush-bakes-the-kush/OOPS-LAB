import java.util.Scanner;

class two{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,m,n,sum=0;
		System.out.println("Enter the Dimentions of the matrix: ");
		m=br.nextInt();
		n=br.nextInt();
		System.out.println("Enter the Elements of the matrix: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=br.nextInt();
		System.out.print("The Principle Diagonal elements are= ");
		for(i=0;i<m;i++){
			sum=sum+a[i][i];
				System.out.print(a[i][i]+" ");
		}
		System.out.print("\nThe Sum of the Principle Diagonal elements is= "+sum);
	}
}