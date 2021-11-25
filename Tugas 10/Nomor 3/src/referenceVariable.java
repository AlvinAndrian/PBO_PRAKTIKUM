public class referenceVariable {
	public static void main (String [] args) {
		String nama;
		try {
			nama = new String();
			System.out.println("Nama : "+ nama);
		}catch (Exception e) {
			System.out.println("Tidak ditemukan " + e);
		}
	}
}
   