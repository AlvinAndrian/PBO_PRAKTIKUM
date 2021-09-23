/* 
Nama   : Alvin Andrian Rizki
NIM    : 201511003
Kelas  : D3 A2 JTK
SOAL 4 OPERATORS1
*/

public class operators1 { // class operators1
    static short methodOne(long l) { // modul methodOne
        int i = (int) l; // variabel i bertipe integer dengan nilai konversi dari variabel l
        return (short)i; // mengembalikan variabel i yang sudah di konversi menjadi tipe data short
    }
    public static void main(String[] args) { // modul main
        double d = 10.25; // variabel bertipe double dengan nilai 10.25 
        float f = (float) d; // variabel f bertipe float dengan nilai konversi dari variabel d
        byte b = (byte) methodOne((long) f); // variabel b bertipe byte dengan nilai konversi dari modul methodOne yang diisi oleh konversi dari variabel f
        System.out.println(b); // menampilkan nilai variabel b
    }
}
