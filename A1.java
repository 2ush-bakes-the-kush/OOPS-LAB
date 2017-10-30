import java.util.Scanner;

class A1 {
   public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         System.out.println("How many strings? ");
         int n=x.nextInt();
        System.out.println("Enter strings:");
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=x.next();
        }
        String temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(s[j].compareTo(s[j+1])>0){
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array-");
        for(int i=0;i<n;i++){
           System.out.println(s[i]);
        }
        
    }

}