package gajiAgent;

import java.util.Scanner;

public class gajiAgent {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		/* 
		 * gaji Rp 500.000
		 * bonus 25% jika berhasil menjual min 40 item
		 * bonus 35% jika berhasil menjual diatas 80 item
		 * menjual <= 15 item, maka denda potong gaji 15% dari total minus penjualan 15 item, selain itu bonus 10% dari setiap item
		 * harga tiap item Rp 50.000
		 */
		
		final int gaji = 500000;
		final int hargaItem = 50000;
		int penjualan, bonus, denda;
		int penghasilan = 0;
		
		System.out.print("Jumlah Penjualan bulan ini : ");
		penjualan = input.nextInt();
		
		if (penjualan >= 80) {
			bonus = (penjualan * hargaItem) * (35/100);
			penghasilan = gaji + bonus ;
			System.out.println("Penghasilan : " + penghasilan);
		} 
		else if (penjualan >= 40 && penjualan < 80) {
			bonus = (penjualan * hargaItem) * (25/100);
			penghasilan = gaji + bonus;
			System.out.println("Penghasilan : " + penghasilan);
		}
		else if (penjualan <= 15 && penjualan >= 1) {
			denda = ((15 * hargaItem) - (14 * hargaItem)) * 15/100;
			penghasilan = gaji - denda;
			System.out.println("Penghasilan : " + penghasilan);
		}
		else {
			bonus = penjualan * (hargaItem * 10/100);
			penghasilan = gaji + bonus;
			System.out.println("Penghasilan : " + penghasilan);
		}
	}
}

/*
 * CERITA :
 * Masalah ada di bagian ketika sedang menerjemahkan narasi atau penjelasan dari soalnya, 
 * pada bagian item kurang dari 15, terdapat kalimat yang membingungkan sehingga sulit untuk
 * mengimplementasikannya ke codingan dan seringkali terjadi kesesuaian dengan hasil, baik 
 * dari contoh atau yang seharusnya. Akhirnya saya bertanya kepada Ibu dan kakak tentang maksud dari narasi tersebut
 */
