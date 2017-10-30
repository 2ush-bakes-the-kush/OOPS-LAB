import java.util.Scanner;

class Q2 {
    public static void main(String args[]){
         Scanner x = new Scanner(System.in);
         System.out.println("Enter a String-");
         String s1 = x.next();
         System.out.println("Enter the replacing substring -");
         String s2 = x.next();
         char c[]=s1.toCharArray(); int k=1,j; String s="";
          for(j=0;j<s1.length();j++){
            for(int i=j+1;i<(s1.length()-1);i++)
            {
                if(c[j]==c[i])
                {
                    s=Character.toString(c[i]);
                    
                }
               
            }
            
          }  
         System.out.println("Converted String-"+s1.replace(s, s2));

    }
}

