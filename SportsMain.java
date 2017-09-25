import java.util.Scanner;
interface Sports{
    void getNumberOfGoals(int a,int b);
    void dispTeam(String a,String b);
}
class Football implements Sports{
    int Ga,Gb;
    String Ta,Tb;
    @Override
    public void getNumberOfGoals(int a,int b){
        Ga=a;
        Gb=b;
    }
    @Override
    public void dispTeam(String a,String b){
        Ta=a;
        Tb=b;
        System.out.print(Ta+" "+Ga+"-"+Gb+" "+Tb);
    }
}
class Hockey implements Sports{
    int Ga,Gb;
    String Ta,Tb;
    @Override
    public void getNumberOfGoals(int a,int b){
        Ga=a;
        Gb=b;
    }
    @Override
    public void dispTeam(String a,String b){
        Ta=a;
        Tb=b;
        System.out.print(Ta+" "+Ga+"-"+Gb+" "+Tb);
    }
}
class SportsMain {
    public static void main (String args[]){
        Scanner br=new Scanner(System.in);
        int ch,ga,gb;
        String ta,tb;
        System.out.print("Enter 1 for Footbal and 2 or Hockey");
        ch=br.nextInt();
        System.out.print("Enter the two Team Names: ");
        ta=br.next();
        tb=br.next();
        System.out.print("Enter the number of Goals Scored by the two Team Names: ");
        ga=br.nextInt();
        gb=br.nextInt();
        if(ch==1){
            System.out.println("Football Match");
            Football obj=new Football();
            obj.getNumberOfGoals(ga, gb);
            obj.dispTeam(ta, tb);
        }
        if(ch==2){
            System.out.println("Hockey Match");
            Hockey obj=new Hockey();
            obj.getNumberOfGoals(ga, gb);
            obj.dispTeam(ta, tb);
        }
    }
}
