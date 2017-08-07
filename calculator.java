import java.util.Scanner;

class calculator{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
                double a,b;
                char c,op;
                do{
                     System.out.print("Enter the First Operand: ");
                     a=br.nextInt();
                     System.out.print("Enter the Operator: ");
                     c=br.next().charAt(0);
                     System.out.print("Enter the Second Operand: ");
                     b=br.nextInt();
                     switch(c){
                        case '+':System.out.print(a+" + "+b+" = "+(a+b));
                            break;
                        case '-':System.out.print(a+" - "+b+" = "+(a-b));
                            break;
                        case 'x':System.out.print(a+" x "+b+" = "+(a*b));
                            break;
                        case '/':System.out.print(a+" / "+b+" = "+(a/b));
                            break;
                        default:System.out.print("Invalid Input");
                        }
                    System.out.println("\nDo you want to Continue Y or N?");
                    op=br.next().charAt(0);
                }while(op=='Y');
        }
}
