public class Array {
	public static void main (String args[])
	   {
		try {
			  //Deklarasi array
		    String[] mahasiswa = {"Rini","Aldi","Acep","Putra"};

		    //Menampilkan isi array pada indeks ke-2
		    System.out.println(mahasiswa[5]);
		} catch (Exception e) {
			System.out.println("Index Array tidak ditemukan");
		}
	   }
}
