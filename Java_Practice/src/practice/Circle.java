package practice;
//Calculate and print area of circle
public class Circle {
	
		static double area;
		
		public double calArea()
		{
			double r=2;
			area=3.14*r*r;
			return area;
		}
	public static void main (String args[])
	{
		Circle c1 = new Circle();
		c1.calArea();
		System.out.println("Area= "+area);
	}
	
	

}
