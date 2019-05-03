import java.text.DecimalFormat;

public class Circle extends Point {
	private double r; // radius

	public Circle() {
		super();
		r = 0;
	}

	public Circle(int x, int y, double r) {
		super(x, y);
		setRadius(r);
	}

	public double getRadius() {
		return r;
	}

	public void setRadius(double rval) {
		r = rval < 0 ? 0 : rval;
	}

	// redefines the Shape method getArea
	public double getArea() {
		return Math.PI * r * r;
	}

	// redefines getName
	public String getName() {
		return "Circle";
	}

	public String toString() {
		return ("C = " + super.toString() + "; R = " + r);
	}

}