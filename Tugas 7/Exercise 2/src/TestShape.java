public class TestShape {
	public static void main(String[]args) {
		// Test Shape 1
		Shape s1 = new Shape("blue", true);
		System.out.println(s1.toString());
		
		// Test Shape 2
		Shape s2 = new Shape("White", false);
		System.out.println(s2.toString());
	}
}
