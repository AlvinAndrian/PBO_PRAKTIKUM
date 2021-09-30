package berhitung;

import java.util.Scanner;

public class berhitung {
	public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int A, B, hasil = 0;
         String operator;
         
         System.out.println("Masukan angka 1 <= A,B <= 1000");
         A = input.nextInt(); 
         operator = input.next(); 
         B = input.nextInt();
         
         if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
        	 switch (operator){
             case "*" : hasil = A*B;break; // perkalian
             case "/" : hasil = A/B;break; // pembagian
             case "+" : hasil = A+B;break; // pertambahan
             case "-" : hasil = A-B;break; // pengurangan
             case "%" : hasil = A%B;break; // pembagian
             default : System.out.println("Tidak Ada");
        	 }
         } else {
        	 System.out.println("Tidak bisa, angka kurang dari 1 atau lebih dari 1000");
         }
          System.out.println(hasil);
    }
}

/* 
 * PERMASALAHAN :
 * Terjadi error ketika menggunakan seleksi kondisi If - else, terutama pada operatornya sempat error dengan 
 * menggunakan nextLine() yang mengakibatkan jadinya muncul error main, sejenak kepikiran menggunakan 
 * witch - case, hingga saya coba dan error dioperator sudah tidak lagi muncul
 */ 
