package exception_handling;

public class TestThrow {
	
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException ("Invalid age");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		validate(15);
		System.out.println("code");

	}

}
