import java.util.Scanner;

class Student_Detail{
    String name,id;
    static String college_name="MIT";
    Student_Detail(String a,String b){ 
        name=a;
        id=b;
    }
    void display_details(){
       System.out.println("Name\tId\t\tCollege");
       System.out.println(name+"\t"+id+"\t"+college_name);
    }
}
class StudenMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        int n;
        String name, id;
        System.out.print("Enter the number of students:");
        n=br.nextInt();
        Student_Detail obj[]=new Student_Detail[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name and ID of Student "+(i+1));
            name=br.next();
            id=br.next();
            obj[i]=new Student_Detail(name,id);
        }
        for(int i=0;i<n;i++){
            obj[i].display_details();
        }
    }   
}
