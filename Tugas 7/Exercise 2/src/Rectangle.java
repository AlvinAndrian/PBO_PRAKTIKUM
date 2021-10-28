public class Rectangle extends Shape {
	// instance variables width (double) and length (double)
	private double width;
	private double length;
	
	// constructor 1
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	// constructor 2
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	// constructor 3
	public Rectangle(double w, double l, String c, boolean f) {
		this.width = w;
		this.length = l;
		this.setColor(c);
		this.setFilled(f);
	}

	// getter width
	public double getWidth() {
		return width;
	}

	// setter width
	public void setWidth(double width) {
		this.width = width;
	}

	// getter length
	public double getLength() {
		return length;
	}

	// setter length
	public void setLength(double length) {
		this.length = length;
	}
	
	// menghitung luas
	public double getArea() {
		return length*width;
	}
	
	// menghitung keliling
	public double getPerimeter() {
		return (2*length)+(2*width);
	}
	
	@Override
	public String toString() {
		return "Rectangle["+super.toString()
			+",width="+width
			+",length="+length+"]";
	}
}
