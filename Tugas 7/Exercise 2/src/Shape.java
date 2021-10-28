public class Shape {
	// instance variables color (String) and filled (boolean)
	private String color;
	private boolean filled;
	
	// constructor 1
	public Shape() {
		color = "Green";
		filled = true;
	}
	
	// constructor 2
	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}

	// getter color
	public String getColor() {
		return color;
	}

	// setter color
	public void setColor(String color) {
		this.color = color;
	}

	// getter filled
	public boolean isFilled() {
		return filled;
	}

	// setter filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "A Shape with color of " + color + " and " + "filled " + filled;
	}
}
