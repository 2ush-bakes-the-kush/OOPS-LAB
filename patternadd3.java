import java.util.Scanner;

class patternadd3 {
    public static void main(String[] args){
       Scanner br=new Scanner (System.in);
       int i,j,c,k=1;
       System.out.print("Enter the number of rows: ");
       c=br.nextInt();
       for(i=1;i<=c;i++){
            for(j=0;j<i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
    

