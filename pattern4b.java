import  java.util.Scanner;

class pattern4b {
   public static void main(String[] args){
       Scanner br=new Scanner (System.in);
       System.out.print("Enter the number upto which the pattern is to be printed:");
       int j,c;
       c=br.nextInt();
       int a[]=new int[15];
       for(j=1;j<=c;j++)
           a[j-1]=j;
       for(int i:a)
       {
           for(j=1;j<=i;j++){
                System.out.print(i+" ");  
           }
        System.out.println("\n");
       } 
    }
}

