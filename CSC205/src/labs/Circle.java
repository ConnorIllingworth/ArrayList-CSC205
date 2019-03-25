package labs;

public class Circle
{
	double center_X;
	double center_Y;
	private double radius;
	
	//Constructors
	public Circle()
	{
		center_X = 0;
		center_Y = 0;
		radius = 0;
	}
	
	public Circle(double rad)
	{
		center_X = 0;
		center_Y = 0;
		setRadius(rad);
		rad = getRadius();
	}
	
	public Circle(double x, double y, double rad)
	{
		center_X = x;
		center_Y = y;
		setRadius(rad);
		rad = getRadius();
	}
	
	//getters && Mutators
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double rad)
	{
		if(rad < 0)
			radius = 0;
		else
			radius = rad;
		
	}
	
	public double getArea()
	{
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double getCircumference()
	{
		return (2*Math.PI*radius);
	}
	
	public boolean intersect(double x, double y)
	{
		if(Math.pow(y-center_Y,2)+Math.pow(x-center_X, 2)<=Math.pow(radius, 2))
			return true;
		else
			return false;
	}
	
	public boolean intersect(Circle other)
	{
		if(Math.pow(other.center_Y - center_Y, 2)+ Math.pow(other.center_X - center_X, 2) <= Math.pow(radius + other.getRadius(), 2))
			return true;
		else
			return false;
	}
}
