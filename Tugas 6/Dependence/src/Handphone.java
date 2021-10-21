public class Handphone {
	String merek; 
	String status;
	
	public void start(Baterai n) {
		n.menyala();
	}
	
	public void berjalan( ) {
		System.out.println("Handphone berjalan");
	}
	
	public void stop(Baterai n) {
		n.mati();
	}
}
