import java.util.Scanner;

public class textfield {
	public static void main(String[] args) {
		try {
			 // deklarasi variabel
	        String nama;
	        int umur;

	        // membuat scanner baru
	        Scanner keyboard = new Scanner(System.in);

	        // Tampilkan output ke user
	        System.out.print("Nama : ");
	        nama = keyboard.nextLine();
	        System.out.print("Umur : ");
	        umur = keyboard.nextInt();
		}catch (Exception e) {
			System.out.println("ERROR !!!!");
			System.out.println("Nama harus bertipe String dan Umur harus bertipe integer !!!");
		}
       
        
	}
}
