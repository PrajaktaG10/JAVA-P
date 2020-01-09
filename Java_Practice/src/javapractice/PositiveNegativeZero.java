package javapractice;
//Program to know whether entered number is positive,negative or zero
import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("Positive number");
		}
		else if(n<0)
		{
		   System.out.println("Negative number");	
		}
		else
		{
			System.out.println("zero");
		}
	}

}
