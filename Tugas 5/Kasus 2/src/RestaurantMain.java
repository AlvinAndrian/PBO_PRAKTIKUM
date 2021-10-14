public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		System.out.printf("\n");
		System.out.println("---------------");
		
		menu.Pemesanan("Bala-Bala", 6);
		
		System.out.println("---------------");
		System.out.println("Stok yang tersisa");
		System.out.printf("\n");
		menu.tampilMenuMakanan();
	}
}