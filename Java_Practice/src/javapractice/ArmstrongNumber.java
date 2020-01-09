package javapractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153, c=0,a;
       int temp=n;
       while(n>0)
       {
    	   a=n%10;
    	   n=n/10;
    	   c=c+(a*a*a);
       }
       if(temp==c)
       {
    	   System.out.println("Armstrong number");
       }
       else
       {
    	   System.out.println("Not armstrong number");
       }
	}

}
