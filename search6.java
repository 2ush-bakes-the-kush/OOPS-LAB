import java.util.Scanner;

class search6 {
    public static void main(String[] args){
    Scanner br=new Scanner (System.in);
    int a[]=new int[15];
    int s,j,m,k=0;
    System.out.print("Enter the size of the array");
    m=br.nextInt();
    System.out.print("Enter the elements of the array: ");
    for(j=0;j<m;j++)
        a[j]=br.nextInt();
    System.out.print("Enter the element to be searched");
        s=br.nextInt();
    System.out.println("The value is found at locations:");
       for(int i:a)
       {
         if(a[k++]==s)
         {
           System.out.print("a["+(k-1)+"]  ");
         }
       }
    }
}

