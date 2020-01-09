package javapractice;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		//Using for loop--to get even numbers between 1 to 20
		/*for (int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number:"+i);
          	}
          			if(i%2==1)
			{
				System.out.println("Odd number:"+i);
	}
       	}
		*/
		
		//To find even and odd number by Getting values from user
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n =s.nextInt();
		/*if(n%2==0)
		{
			System.out.println("You have entered an Even number");
	}
		else {
			System.out.println("You have entered an Odd number");
		}*/
		
		//Using Ternary operator
		int m=15;
		String o=(n%2==0)?"Even number":"Odd number";
		System.out.println(o);
		
		
	}
}
