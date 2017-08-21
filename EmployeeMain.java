import java.util.Scanner;

class Employee{
    String name,city;
    double salary,da,hra;
    Scanner br=new Scanner(System.in);
    void getData(){
        System.out.println("Enter the name,city,basic salary,DA and HRA");
        name=br.nextLine();
        city=br.nextLine();
        salary=br.nextInt();
        da=br.nextInt();
        hra=br.nextInt();
    }
    double calculate(){
        double total=salary*(1+(da/100+hra/100));
        return total;
    }
    void display(){
        double tot=calculate();
        System.out.println("Name\tCity\tBasic Salary\tTotal Salary");
        System.out.print(name+"\t"+city+"\t"+salary+"\t\t"+tot);
    }
}
class EmployeeMain {
    public static void main(String args[]){
    Employee obj1=new Employee();
    obj1.getData();
    obj1.display();
     }
}
