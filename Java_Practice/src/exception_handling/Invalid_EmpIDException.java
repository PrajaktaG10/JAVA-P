package exception_handling;

public class Invalid_EmpIDException extends RuntimeException {
	
public Invalid_EmpIDException(String msg) 
{
	super(msg);
	System.out.println("Invalid employee id generation attempt ");
}


}
