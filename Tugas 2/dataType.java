import java.util.Scanner;

public class dataType{ // class dataType
    public static void main(String []argh) { // modul main
        Scanner input = new Scanner(System.in); // variabel input untuk menginput nilai dari keyboard
        for (int i=0;i<5;i++) { // Perulangan untuk 5 angka berulang
            try { // Supaya tidak terjadi error ketika dijalankan
                long num=input.nextLong(); // variabel
                System.out.println(x+" can be fitted in:"); // menampilkan tulisan "can be fitted in : "
                if(num>=-128 && =num<=127) // penyeleksian kondisi jika num lebih dari sama dengan -128 dan jika kurang dari sama dengan 127
                    System.out.println("* byte"); // menampilkan tulisan "* byte"
                if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE) // penyeleksian kondisi jika num lebih dari nilai minimum tipe data short dan jika kurang dari nilai maksimal tipe data short
                    System.out.println("* short"); // menampilkan tulisan "* short"
                if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE) // penyeleksian kondisi jika num lebih dari nilai minimum tipe data int dan jika kurang dari nilai maksimal tipe data int
                    System.out.println("* int"); // menampilkan tulisan "* int"
                if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE) // penyeleksian kondisi jika num lebih dari nilai minimum tipe data long dan jika kurang dari nilai maksimal tipe data long
                    System.out.println("* long"); // menampilkan tulisan "* long"
            }
            catch(Exception e) { // supaya tidak terjadi error ketika dijalankan
                System.out.println(input.next()+" can't be fitted anywhere."); // menampilkan nilai dari input.next() dan "can't be fitted anywhere."
            }
        }
    }
}
