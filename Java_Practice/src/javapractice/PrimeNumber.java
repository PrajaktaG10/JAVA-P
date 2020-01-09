package javapractice;
import java.util.Scanner;



public class PrimeNumber {

	public static void main(String[] args) {
		for (int i=1; i<=20; i++)
		{	
	         for (int j=2; j<Math.sqrt(i); j++)
		{
				if(i%j==0)
				{
				  System.out.println("Prime number:" +j);
				}
	       
		}
		}
	/*Scanner s= new Scanner(System.in);
	System.out.println("Enter a number");
	int n= s.nextInt();
	if(isPrime(n)) {
		System.out.println(n+ " is a prime number");
	}
	else
	{
		System.out.println(n+ " is not a prime number");
	}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		for(int i=2; i<Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	*/

}
}