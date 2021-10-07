package kasus2;

public class Item {
	private String name;
	private Item() { // ini kok ga ke eksekusi terossss
		name = "Ipin";
	}
	
	public Item(String name) {
		System.out.println(name);
	}
}