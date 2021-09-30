package array;

public class array {
	public static void main (String [] args) {
		//One Dimensional Arrays
		int[] fisrtArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eighthArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
		thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
		sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
		ninthArray};
		
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1,
		twoDimensionalArray2, twoDimensionalArray3};
		
		for(int k = 0; k < threeDimensionalArray.length; k++) {
			System.out.print("{");
			for(int l = 0; l < threeDimensionalArray.length; l++) {
				System.out.printf("{");
				for(int m = 0; m < threeDimensionalArray.length; m++) {
					System.out.printf(" " + threeDimensionalArray[k][l][m] + " ");
				}
				System.out.printf("}");
			}
			System.out.println("}");
		}
	}
}

/* 
 * CERITA :
 * Bingung mau nambahin apa untuk bisa menampilkan tampilan seperti pada pertaanyaan tersebut, lalu saya mencoba
 * untuk menggunakan perulangan for walaupun awalnya gagal, namun sedikit demi sedikit tau dimana letak salahnya 
 * dan akhinya sesuai
 */ 
