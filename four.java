import java.util.Scanner;

class four{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int sum[][]=new int[10][10];
		int mul[][]=new int[10][10];
		int i,j,m,n,c=0,p,q,k;
		System.out.println("Enter the Dimentions of the matrix A: ");
		m=br.nextInt();
		n=br.nextInt();
		System.out.println("Enter the Dimentions of the matrix B: ");
		p=br.nextInt();
		q=br.nextInt();
		System.out.println("Enter the Elements of the matrix A: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=br.nextInt();
			System.out.println("Enter the Elements of the matrix B: ");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				b[i][j]=br.nextInt();
		if(m==p&&n==q){
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("\n\n-->Matrix Addition:");
			for(i=0;i<m;i++){
				for(j=0;j<n;j++){
					System.out.print(sum[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		else
			System.out.print("Matrix Addition not Possible");
		if(n==p){
			for (i = 0; i < m; i++){
				for (j = 0; j < q; j++){
					for (k = 0; k < n; k++){
						mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("\n\n-->Matrix Multiplication:");
			for(i=0;i<m;i++){
				for(j=0;j<q;j++){
					System.out.print(mul[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		else
			System.out.print("Matrix Multiplication Not Possible");
	}
}