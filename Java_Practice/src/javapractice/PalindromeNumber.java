package javapractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*String original,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a nuber you want to check for palindrome");
		original=in.nextLine();
		int length=original.length();
		for(int i=length-1; i>=0;i--)
		reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}*/
		
		//Other way
		
		int n=454,r,sum=0, temp;
		temp=n;
		while(n>0) {
			r=n%10;   //Getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Numberis not palindrome");
		}
		
		

	}

	

}
