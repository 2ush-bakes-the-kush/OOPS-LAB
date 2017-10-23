
import java.util.Scanner;

class Q11 {
    static void check(int m,int n)throws NotSquareMatrixException{
                if(m!=n){
                  throw new NotSquareMatrixException("Error!! This is not a square Matrix");
                }
            }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int a[][]=new int[100][100];
          int m,n;
          System.out.println("Enter the dimentions of the matrix");
          m = sc.nextInt();
          n = sc.nextInt();
          try{
             check(m,n); 
          }
        catch(NotSquareMatrixException ex){
         System.out.println(ex);
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
    }
}
class NotSquareMatrixException extends Exception{
    String a;
    NotSquareMatrixException(String b){
           a=b;
    }
   @Override
    public String toString(){
        return a;
    }
}