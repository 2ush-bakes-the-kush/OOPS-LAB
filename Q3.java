import java.util.Scanner;

class Q3 {
     public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,s="",n; int j,l=0; char c[],t;
        System.out.println("Enter a string:");
        str=in.nextLine();
        for(int i=(str.length()-1);i>=0;i--)
        {
            s +=str.charAt(i);
        }
        System.out.println("The reversed string: "+s);
        
        if( str.equalsIgnoreCase(s))
             System.out.println("Palindrome");
        else
             System.out.println("Not a palindrome");
        
        
        
        String ch= str.concat(s);
        System.out.println("The concatenated string: "+ch);
        boolean f=false;
        c=str.toCharArray();
        for(j=0;j<str.length();j++){
        for(int i=0;i<(str.length()-1);i++)
        {
            if(c[i]>=65&&c[i]<=91){
                c[i]+=32;
        }
            
          if(c[i]>c[i+1])
          {
              t=c[i];
              c[i]=c[i+1];
              c[i+1]=t;
          }
           
        }  
       }
      n= new String(c);
      System.out.println("The string in alphabetical order: "+n);
       
       
}
}
