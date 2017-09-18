class Example6 {
     static int i;
    static String s;
    static void display(){
        Example6 obj1=new Example6();
        System.out.println("i="+obj1.i);
        System.out.println("i="+obj1.i);
    }
    void funcn(){
        display();
    }
    public static void main(String args[]){
        display();
    }
}
