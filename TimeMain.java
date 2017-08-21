import java.util.Scanner;
class Time{
    int hr,min,sec;
    Time(){
        hr=0;
        min=0;
        sec=0;
    }
    Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println(hr+":"+min+":"+sec);
    }
    
    void add(Time obj1,Time obj2){
        obj1.display();
        obj2.display();
        this.sec = obj1.sec + obj2.sec;
        this.min = obj1.min + obj2.min;
        this.hr = obj1.hr + obj2.hr;

        if(this.sec >= 60)
        {
            this.min+= this.sec / 60;
            this.sec = this.sec % 60;
        }
        if(this.min >= 60)
        {
            this.hr+= this.min / 60;
            this.min = this.min % 60;
        }
        if(this.hr>=24){
            this.hr%=24;
        }
    }      
}
class TimeMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        Time obj3=new Time();
        int hh,mm,ss;
        System.out.print("Enter the first time");
        hh=br.nextInt();
        mm=br.nextInt();
        ss=br.nextInt();
        Time obj1=new Time(hh,mm,ss);
        System.out.print("Enter the second time");
        hh=br.nextInt();
        mm=br.nextInt();
        ss=br.nextInt();
        Time obj2=new Time(hh,mm,ss);
        obj1.add(obj3, obj2);
        obj3.display();
    }
}
