package bukaTutupJalan;

import java.util.Scanner;

public class bukaTutupJalan {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int mobilA, mobilB, mobilC, mobilD;
		String gabungan;
		
		mobilA = input.nextInt();
		mobilB = input.nextInt();
		mobilC = input.nextInt();
		mobilD = input.nextInt();
		
		
		gabungan = String.valueOf(mobilA) + String.valueOf(mobilB) + String.valueOf(mobilC) + String.valueOf(mobilD);
	
		long gabung = Long.parseLong(gabungan);
		//System.out.println(pengurangan);
		float kurang = (float)gabung - 999999;
		//System.out.println(kurang);
		float modulo = kurang % 5;
		//System.out.println(modulo);
		
		if (modulo == 0) {
			System.out.println("Berhenti");
		}
		else if (modulo != 0) {
			System.out.println("Jalan");
		}
	}
}

/*
 * CERITA :
 * Awal dari masalah pembuatan ini adalah ketika mencoba untuk menggabungkan 4 plat nomer secara bersamaan menjadi,
 * satu, mungkin jila menggunakan String masih dapat dilakukan, tapi sama sekali tidak kepikiran dengan integer,
 * disitu saya saya teringat dengan konversi tipe data dan bagaimana jika saya mencoba mengkonversi tipe data dari integer
 * ke String untuk menggabungkannya jadi satu. Dengan menggunakan String.valueOf(variabel) sehigga bisa dikonversi jadi 
 * String, namun ada lagi masalah ketika menghinversi kembali menjadi integer, dimana ukuran tipe data integer tidak
 * cukup untuk menampung gabungan dari string tersebut, hingga saya memutuskan untuk menggunakan tipe data long. Ketika
 * semua selesai ada satu masalah yang saya sendiri masih kurang tau dimana letak kesalahannya, hasil dari 3555 2333 4555 6660
 * yang seharusnya 0, namun disini tidak walaupun secara hasil dari semuanya itu adalah benar
 * 
 */
