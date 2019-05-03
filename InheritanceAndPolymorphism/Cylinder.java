import java.text.DecimalFormat;

public class Cylinder extends Circle {

	private double h; //height
	
	public Cylinder()
	{
		super();
		h = 0;
	}
	public Cylinder(int x, int y, double r, double h)
	{
		super(x,y,r);
		setHeight(h);
	}
	public String getName()
	{
		return "Cylinder";
	}
	public double getHeight()
	{
		return h;
	}
	public void setHeight(double hval)
	{
		this.h = hval;
	}
	
	//redefines getArea
	public double getArea()
	{
		return (2* super.getArea() + 2* Math.PI * getRadius()*h);
	}
	//redefines the Shape method getVolume
	public double getVolume()
	{
		return (super.getArea())*h;
	}
	public String toString()
	{
		return (super.toString() + "; H = " + h);
	}
}
