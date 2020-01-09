package practice;

public class Box {

	private double length;
	private double width;
	private double height;
	
	public Box(double l,double w, double h)
	{
		if(l<=0||w<=0||h<=0)
			throw new InvalidBoxException("Invalid box object creation");
		length=l;
		width=w;
		height=h;
	}
	
		
		double getLength(){
			return length;
		}
		double getWidth(){
			return width;
		}
		double getHeight(){
			return height;
		}
		
		double area()
		{
			return 2*length*width+width*height+height*length;
		}
			double volume()
			{
				return length*width*height;
			}
		}

