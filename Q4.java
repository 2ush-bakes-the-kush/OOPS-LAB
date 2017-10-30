import java.util.Scanner;

class Q4 {public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       
        System.out.println("Enter two strings");
        String s1,s2;
        s1=in.nextLine(); s2=in.nextLine();
        int i=s1.compareTo(s2);
        if(i>0)
         System.out.println("The first string > second string");
        else if(i<0)
              System.out.println("The second string > first string");
        else if(i==0)
              System.out.println("The strings are equal");
       
       
          System.out.println("Enter a string with both upper and lower case letters");
          String S; S=in.nextLine();
          char c[]=S.toCharArray();
          for(  i=0;i<S.length();i++)
          {
              if(c[i]>=65 && c[i]<91)
                  c[i]=(char) (c[i]+32);
              else if(c[i]>=97 && c[i]<123)
                   c[i]=(char) (c[i]-32);
          }
        String  n= new String(c);
      
       System.out.println("The string after conversion "+n);
       
                
        }
    
    
}
