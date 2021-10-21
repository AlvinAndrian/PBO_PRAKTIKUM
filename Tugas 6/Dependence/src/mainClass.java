public class mainClass {
	public static void main(String[] args) {
		Handphone h = new Handphone();
		Baterai b = new Baterai();
		
		h.start(b);
		h.berjalan();
		h.stop(b);
	}

}
