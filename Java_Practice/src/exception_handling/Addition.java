//Calculator with scanner and switch case
import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Select operation from list below:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice");
		int i = s.nextInt();
		
		System.out.println("Enter first number");
		int a= s.nextInt();
		System.out.println("Enter second number");
		int b= s.nextInt();
		double result=0;
		
		switch(i)
		{
			case 1:
		    result=a+b;
		    break;
		    case 2:
		    result=a-b;
			break;
			case 3:
		    result=a*b;
			break;
			case 4:
				if (b==0)
				{
					System.out.println("Division not possible");
				}
				else
		    result=a/b;
		  default: 
			  System.out.println("You have entered wrong choice");
		}
		System.out.println("Result: "+result);
		
	}

}
