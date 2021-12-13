package Barang;

import java.io.FileReader;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			ArrayList<barang> produk = gson.fromJson(
					new FileReader("D:\\2. POLBAN\\PEMBELAJARAN\\Semester 3\\PBO\\1. praktek\\Tugas 12\\Tugas 12\\src\\Barang\\file.json"), 
					new TypeToken<ArrayList<barang>>() {}.getType()
					);
			for(int i=0;i<produk.size();i++){
            System.out.println("Barang ke- "+(i+1)+": "+produk.get(i).toString());
			}
		}catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

