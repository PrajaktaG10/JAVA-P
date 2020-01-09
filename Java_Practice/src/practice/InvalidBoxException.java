package practice;

public class InvalidBoxException  extends RuntimeException{
	public InvalidBoxException(String msg)
	{
		super(msg);
		System.out.println("An attempt is made to create an Invalid box object");
	}
	

}
