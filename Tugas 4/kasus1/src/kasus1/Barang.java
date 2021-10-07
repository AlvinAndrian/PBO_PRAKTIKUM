package kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok = 0;

	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		tambahStok(stk);
	}
	
	public int getStok() {
		return stok;
	}
	
	public void tambahStok(int stok) {
		this.stok += stok;
	}
}
