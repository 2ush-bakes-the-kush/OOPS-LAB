import java.util.Scanner;

class three{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,m,n,c=0;
		System.out.println("Enter the Dimentions of the matrix: ");
		m=br.nextInt();
		n=br.nextInt();
		System.out.println("Enter the Elements of the matrix: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=br.nextInt();
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(a[i][j]!=a[j][i]){
					c=1;
					break;
				}
			}
		}
		if(c==0)
			System.out.println("The Matrix is a Symmetric Matrix");
		else
			System.out.println("The Matrix is not a Symmetric Matrix");
	}
}