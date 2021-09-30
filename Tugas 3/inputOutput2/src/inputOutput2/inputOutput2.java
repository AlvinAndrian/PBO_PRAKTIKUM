package inputOutput2;

import java.util.Scanner;

public class inputOutput2 {
	public static void main (String[]args) {
		
		Scanner input = new Scanner (System.in);
		int[] num = new int [3];
		String[] name = new String [3];
		
		for (int i = 0; i <= 2; i++) {
			String nameln = input.next();
			if (nameln.length() <= 15 ) {
				int numln = input.nextInt();
				if (numln >= 1 && numln <= 999) {
					name[i] = nameln;
					num[i] = numln;
				}
				else {
					System.out.printf("Angka kurang dari 1 dan lebih dari 999");
				}
			}
			else {
				System.out.printf("Nama lebih dari 15 karakter");
			}
		}
		
		System.out.printf("\n");
		System.out.println("===============================");
		for (int k = 0; k <= 2; k++) {
			System.out.printf("%s\t\t %03d\n", name[k], num[k]);
		}
		System.out.println("===============================");
	}
}

/*
 * CERITA :
 * Pada pembuatan list atau awal ketika menggunakan array sedikit membuat saya bingung, bagaimana caranya bisa menjadi
 * list seperti ini? disitu saya inget ketika menggunakan array, namun karena syntax bahasa C dan java sedikit berbeda
 * saya menemukan permasalahan, saya lihat diinternet dan akhirnya bisa
 */
