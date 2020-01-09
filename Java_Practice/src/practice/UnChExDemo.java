package practice;

import java.util.*;
import java.lang.*;

public class UnChExDemo {

	
	public static void main(String[] args) {
		int a,b;
		try
		{
			System.out.println("Enter 1st number: ");
			Scanner s = new Scanner(System.in);
			a=s.nextInt();
			System.out.println("Enter 2nd number: ");
			b=s.nextInt();
			int result=a/b;
			System.out.println("Result is :"+result);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid format. Enter integer number");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid number");
		}
		catch(NullPointerException e)
		{
			System.out.println("Enter number");
		}


	}

}
