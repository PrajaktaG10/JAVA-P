package exception_handling;

public class InvalidRadiusException extends RuntimeException{

public InvalidRadiusException(String msg) 
{
    super(msg);
    System.out.println("An attempt is made to create invalid circle");


}

}
