
import java.util.Scanner;


class Pattern4a {
    public static void main(String[] args){
       Scanner br=new Scanner (System.in);
       int i,j,c;
       System.out.print("Enter the number upto which the pattern is to be printed:");
       c=br.nextInt();
       for(i=1;i<=c;i++){
            for(j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
