import java.util.Scanner;

class Prime5 {
    public static void main(String[] args){
       Scanner br=new Scanner (System.in);
       int i,j,m,n,c;
       System.out.print("Enter the limits between which prime numbers are to be printed: ");
       m=br.nextInt();
       n=br.nextInt();
       for(i=m;i<=n;i++){
           c=0;
           for(j=2;j<i;j++){
               if(i%j==0){
                   c=1;
                   break;
               }
           }
           if(c==0)
               System.out.print(i+" ");
       }
    }
}
