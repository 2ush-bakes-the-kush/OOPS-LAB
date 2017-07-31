import java.util.Scanner;

class one{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,m,n,sum=0;
		System.out.println("Enter the Dimentions of the matrix: ");
		m=br.nextInt();
		n=br.nextInt();
		if(m==n){
			System.out.println("Enter the Elements of the matrix: ");
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
					a[i][j]=br.nextInt();
				System.out.print("The Non-Diagonal elements are= ");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					if((i==j)||(i+j==m-1))
						continue;
					else{
						sum=sum+a[i][j];
						System.out.print(a[i][j]+" ");
					}
				}
			}
			System.out.print("\nThe Sum of the Non-Diagonal elements is= "+sum);
		}
		else
			System.out.print("Please enter a square matrix");
	}
}