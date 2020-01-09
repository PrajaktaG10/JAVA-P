package exception_handling;

public class Circle extends Shape implements Printable{
        int radius;
        final float PI=3.14f;
        
        public Circle()
        {
        	radius=10;
        }
	public Circle(int r)
	{
		
		if (radius<=0)
			throw new InvalidRadiusException("Invalid circle creation");
		radius=r;
	}
        
	public double area()
	{
		return(PI*radius*radius);
	}
	public double circumference()
	{
		return(2*PI*radius);
	}
	public void print()
	{
		System.out.println("I am a circle");
	}
	
	public static void main(String[] args) {
		Circle c1=new Circle();
		Shape c2=new Circle(0);
		Printable p=new Circle();
		System.out.println("C1 Area= "+c1.area());
		System.out.println("C1 Circumference= "+c1.circumference());
		System.out.println("C2 Area "+c2.area());
		p.print();

	}

}
