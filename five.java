import java.util.Scanner;

class five{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int a[][]=new int[10][10];
		int b[]=new int[10];
		int i,j,k=0,n,c=0,M,sumOfRow=0, sumOfColoumns=0, sumOfPrimaryDiagonal=0, sumOfSecondaryDiagonal=0;;
		System.out.println("Enter the Dimention of the matrix: ");
		n=br.nextInt();
		System.out.println("Enter the Elements of the matrix: ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=br.nextInt();
		M=(n*n*(n*n+1)/2)/n;
		for(i=0; i<n; i++){
			sumOfRow=0;
			sumOfColoumns=0;
			for(j=0; j<n; j++){
            sumOfRow += a[i][j];
            sumOfColoumns += a[j][i];
			}
        sumOfPrimaryDiagonal += a[i][i];
        sumOfSecondaryDiagonal += a[i][n-i-1];
        if(sumOfRow!=M || sumOfColoumns!=M)
			c=1;
        }
		if(sumOfPrimaryDiagonal!=M || sumOfSecondaryDiagonal!=M)
		c=1;
	    for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				b[k++]=a[i][j];
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(b[i]==b[j]&&i!=j){
					c=1;
					break;
				}
			}
		}
		if(c==0)
			System.out.println("It is a Magic Square");
		else
			System.out.println("It is not a Magic Square");
	}
}
