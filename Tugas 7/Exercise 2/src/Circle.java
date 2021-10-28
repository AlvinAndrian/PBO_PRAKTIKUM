public class Circle extends Shape {
	// An instance variable radius (double)
	private double radius;
	
	// constructor 1
	public Circle() {
		radius = 1.0;
	}
	
	// constructor 2
	public Circle(double r) {
		this.radius = r;
	}
	
	// constructor 3
	public Circle(double r, String c, boolean f) {
		this.radius = r;
		this.setColor(c);
		this.setFilled(f);
	}

	// getter radius
	public double getRadius() {
		return radius;
	}

	// setter radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// getter area
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// getter perimeter
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius= " + radius + " which is a subclass of " + super.toString();
	}
}
