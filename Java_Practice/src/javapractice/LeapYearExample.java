package javapractice;
import java.util.*;
public class LeapYearExample {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=s.nextInt();
        if(((year%4==0)&& (year%100!=0))||(year%400==0))
        {
        	System.out.println("Leap year");
        }
        else
        {
        	System.out.println("Common year");
        }

	}

}
