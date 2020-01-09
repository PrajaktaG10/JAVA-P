package javapractice;

import java.util.Scanner;

public class NestedIfex {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter age");
		int m=s.nextInt();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight");
		int n=sc.nextInt();
		if(m>=18)
		{
			if(n>50) 
			{
				System.out.println("You are eligible yo donate blood");
			}
			else
			{
				System.out.println("You are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age should be greater than 18");
		}
		

	}

}
