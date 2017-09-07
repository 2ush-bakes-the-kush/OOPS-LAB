import java.util.Scanner;

class Student{
    String name,reg,age;
    Student(String a,String b,String c){
        name=a;
        reg=b;
        age=c;
    }
}
class UGStudent extends Student{
    int sem,fee;
    UGStudent(String a, String b, String c,int d) {
        super(a, b, c);
        sem=d;
    }
    double fees(){
        if(sem==1||sem==2)
            fee=100000;
        else if(sem==3||sem==4)
            fee=200000;
        else if(sem==5||sem==6)
            fee=250000;
        else if(sem==7||sem==8)
            fee=300000;
        else
            ;
        return fee;
    }
    void display(){
        System.out.println("Name\tRegistration No\t\tAge\tCourse\tSemester\tFees");
        System.out.println(super.name+"\t"+super.reg+"\t\t"+super.age+"\t UG\t"+sem+"\t\t"+fees());
    }
}
class PGStudent extends Student{
    int sem,fees;
    PGStudent(String a, String b, String c,int d) {
        super(a, b, c);
        sem=d;
    }
    double fee(){
        if(sem==1||sem==2)
            fees=200000;
        else if(sem==3||sem==4)
            fees=300000;
     return fees;
    }
    void display(){
         System.out.println("Name\tRegistration No\t\tAge\tCourse\tSemester\tFees");
        System.out.println(super.name+"\t"+super.reg+"\t\t"+super.age+"\t PG\t"+sem+"\t\t"+fee());
    }
}
class StudenMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        String n,r,a,type;
        int sem;
        System.out.print("Enter the name registration number and age of the student: ");
        n=br.next();
        r=br.next();
        a=br.next();
        System.out.print("Enter PG or UG course and the semester of study: ");
        type=br.next();
        sem=br.nextInt();
        if(type.equalsIgnoreCase("UG")){
             UGStudent obj=new UGStudent(n,r,a,sem);
             obj.display();
        }
        else if(type.equalsIgnoreCase("PG")){
             PGStudent obj=new PGStudent(n,r,a,sem);
             obj.display();
        }
        else
            System.out.print("Invalid Entry");
    }
}
