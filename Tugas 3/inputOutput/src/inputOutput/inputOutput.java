package inputOutput;

import java.util.Scanner;

public class inputOutput {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		String s, temp="";
		int jumlahKata = 1;
		
		s = input.nextLine();
		int panjangKata = s.length();
        for (int i = 0; i < panjangKata; i++) {
            char k = s.charAt(i);
            
            if (k == ' ' || k == '.' || k == '?' || k == '!' || k == '\'' || k == '_' || k == ',' || k == '@') {
                jumlahKata++;
            }
        }
        System.out.println(jumlahKata);
        
	    for(int i=0; i<s.length(); i++){
	    	if(s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == '\'' || s.charAt(i) == '_' || s.charAt(i) == ',' || s.charAt(i) == '@' && temp.length() > 0){
	    		System.out.println(temp);
	    		temp="";
	    	}
	        else if(s.charAt(i)!=' '){
	        	temp= temp+s.charAt(i);
	        }
	    }
	    System.out.println(temp);
	}
}

/*
 * CERITA :
 * Bingung ketika memisahkan kata perkata dari kalimat tersebut, hal ini terjadi ketika saya berhasil mencari jumlah
 * kata dari kalimatnya, namun ada permasalahan, bagaimana cara saya memisahkan kata perkata dari kalimatnya? akhirnya 
 * saya mencoba mencari jawaban diinternet dan disana saya menemukan CharAt(variabel) dengan fungsi memisahkan huruf
 * perhuruf, merasa bingung karena yang saya butuhkan adalah kata perkata, saya mencoba membuat sebuah kondisi, dimana
 * ketika huruf tersebut bertemu dengan salah satu tanda, maka akan dipindahkan kebawah
 */


