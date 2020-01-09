package exception_handling;

public class Employee implements Printable{
     int empID;
     String name;
     double bSal,hra,da;
     
     public Employee()
     {
    	 empID=100;
    	 name="abc";
    	 bSal=10000;
    	 hra=1000;
    	 da=1000;
     }
     public Employee(int id, String n, double b, double h, double d)
     {
    	 empID=id;
    	 if(empID<=0)
    		 throw new Invalid_EmpIDException("Invalid EmpID");
    	 name=n;
    	 bSal=b;
    	 hra=h;
    	 da=d;
     }
     public double calSal()
     {
    	 return(bSal+hra+da);
     }
     public void print()
 	{
 		System.out.println("I am a Employee");
 	}
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", bSal=" + bSal
				+ ", hra=" + hra + ", da=" + da + "]";
	}
	public static void main(String[] args) {
		Employee e1= new Employee();
		Printable p=new Employee();
		p.print();
		Employee e2=new Employee(0,"xyz",15000,1500,1500);
		System.out.println("Employee Details: ");
		System.out.println(e1);
		System.out.println(e1.calSal());
		System.out.println(e2);
		System.out.println(e2.calSal());
	}

}
