class Wrapper_Example {
  public static void main(String args[]){  
        int a=10;  
        Integer a2=new Integer(a);//Boxing  
        Integer a3=20;//Boxing  
        System.out.println(a2+" "+a3);  
        
        Integer i=new Integer(100);  
        int b=i.intValue();  //unboxing
        System.out.println(b);
 }     
}
