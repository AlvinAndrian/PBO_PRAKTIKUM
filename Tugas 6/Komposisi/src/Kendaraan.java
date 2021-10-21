public class Kendaraan {
	private String warna;
	private int roda;

	public void fiturKendaraan() { 
		System.out.println("Warna Kendaraan = "+warna +  "\njumlah roda= " + roda);
	}
	 
	  //set method
	public void setWarna(String warna) {
		this.warna = warna;
	}
	 
	public void setRoda(int roda) { 
		this.roda = roda; 
	}
}
