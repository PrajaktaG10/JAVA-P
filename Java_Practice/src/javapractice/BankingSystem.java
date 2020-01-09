package javapractice;

public class BankingSystem {
     int acc_no;
     String name;
     double amount;
     
     void insert(int a, String n, double amt) 
     {
    	acc_no=a;
    	name=n;
    	amount=amt;
     }
     void deposit(double amt) 
     {
    	 amount=amount+amt;
    	 System.out.println("You have Deposited:"+amt);
     }
     void withdraw(double amt)
     {
    	 if(amount<amt)
    	 {
    		 System.out.println("You have insufficient balance");
    	 }
    	 else
    	 {
    		 amount=amount-amt;
    		 System.out.println("You have withdrawn:"+amt);
    	 }
     }
	void checkBalance()
	{
		System.out.println("Current balance is:"+amount);
	}
	void viewDetails()
	{
		System.out.println("Account number:"+acc_no+" "+"Name:"+name+" "+"Balance:"+amount);
	}
	
	public static void main(String[] args) {
	BankingSystem b1=new BankingSystem();
	b1.insert(123456789, "abcd", 50000);
	b1.checkBalance();
	b1.deposit(15000);
	b1.withdraw(5000);
	b1.checkBalance();
	b1.viewDetails();
	}

}
