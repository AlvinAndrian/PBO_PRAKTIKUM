import java.util.Scanner;

public class hexadecimal {
	public static int IntHexadecimal(String hexadecimal) {
	    try {
	        return Integer.parseInt(hexadecimal, 16);
	    } catch (Exception e) {
	        return 0;
	    }
	}
	public static String inputHex() {
		String hexadecimal=null;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Masukan bilangan hexadecimal : ");
				hexadecimal = sc.next();
				int cek = IntHexadecimal(hexadecimal);
				System.out.println( "hasilnya : " +cek);
				System.out.println("-----------------------------------------------");
			}
		}
	}
	
	public static void main(String[] args) {
		inputHex();
	}
}