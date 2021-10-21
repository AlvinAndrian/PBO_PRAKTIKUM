public class employeeClass {
	int id;
	String nama;
	addressClass alamat;
	
	public employeeClass (int id, String nama, addressClass alamat) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
	}
	
	void display() {
		System.out.println(id + " " + nama);
		System.out.println(alamat.kota + " " + alamat.daerah + " " + alamat.negara);
	}
	
	public static void main (String[]args) {
		// Dibuat dari class addressClass
		addressClass address = new addressClass ("Bandung,", "Cihanjuang,", "Indonesia");
		employeeClass employee = new employeeClass (201511003, "Alvin", address);
		
		employee.display();
	}
}
