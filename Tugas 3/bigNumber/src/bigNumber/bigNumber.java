package bigNumber;

import java.util.Scanner;

public class bigNumber {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, digitNum1, digitNum2;
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		digitNum1 = jumlahDigit(num1);
		digitNum2 = jumlahDigit(num2);
		
		if ((digitNum1 < 0 || digitNum2 < 0) && (digitNum1 >= 200 || digitNum2 >= 200)) {
			System.out.println("Digit kurang dari 1 atau lebih dari 200");
			input.close();
		}
		
		int pertambahan = num1 + num2;
		int perkalian = num1 * num2;
		
		System.out.printf("\n");
		System.out.println(pertambahan);
		System.out.println(perkalian);
	}

	public static int jumlahDigit (int angka) {
		
		int jumlah = 0;
		
		while (angka != 0) {
			angka = angka / 10;
			jumlah++;
		}
		return jumlah;
	}
}

/*
 * CERITA :
 * Bingung ketika mencari banyaknya digit dari num1 dan num2, hingga saya mencoba untuk mencari diinternet cara mencari
 * banyaknya digit, ternyata dengan menambahkan method baru bernama jumlahDigit yang didalamnya ada perulangan while dan 
 * return jumlah
 */

