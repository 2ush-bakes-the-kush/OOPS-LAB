import java.util.Scanner;

class larsma{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
                int lar,sma,a,b,c;
                System.out.println("Enter Three Numbers: ");
                a=br.nextInt();
                b=br.nextInt();
                c=br.nextInt();
                lar=a>b&&a>c?a:b>c?b:c;
                sma=a<b&&a<c?a:b<c?b:c;
                System.out.println("Largest= "+lar);
                System.out.println("Smallest= "+sma);
        }
}