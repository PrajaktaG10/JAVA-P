package exception_handling;
//Use of Setter and getter 
public class MyDate1 {

	
	int day, month, year;

	public MyDate1(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
	}
	public MyDate1()
	{
		
	}
	public void setDay(int d)
	{
		day= d;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(int m)
	{
		month= m;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int y)
	{
		year= y;
	}
	public int getYear()
	{
		return year;
	}
	
	
	public static void main(String[] args) {
	MyDate1 d1= new MyDate1();
	MyDate1 d2= new MyDate1();
	MyDate1 d3= new MyDate1(10,12,2019);
	d1.setDay(9);
	d1.setMonth(9);
	d1.setYear(1990);
	d2.setDay(10);
	d2.setMonth(12);
	d2.setYear(1993);
	
	System.out.println("DOB is: "+d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
	System.out.println("DOB is: "+d2.getDay()+"/"+d2.getMonth()+"/"+d2.getYear());

	}

}
