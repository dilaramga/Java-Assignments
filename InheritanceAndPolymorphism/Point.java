public class Point extends Shape {
	private int x, y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int xval, int yval) {
		x = xval;
		y = yval;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int xval) {
		this.x = xval;
	}

	public void setY(int yval) {
		this.y = yval;
	}

	public String getName() {
		return "Point";
	}

	public String toString() {
		return ("[" + x + "," + y + "]");
	}

}
