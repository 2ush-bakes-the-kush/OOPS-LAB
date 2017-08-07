import java.util.Scanner;

class leap{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		int y;
		System.out.print("Enter the year: ");
		y=br.nextInt();
		boolean isLeapYear=((y%4==0&&y%100!=0)||y%400==0);
		if(isLeapYear)
			System.out.print("The Year Entered is a Leap Year");
		else
			System.out.print("The Year Entered is not a Leap Year");
	}
}	
			
			
			
			
			
			
		