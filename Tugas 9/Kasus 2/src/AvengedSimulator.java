public class AvengedSimulator {
	public static void main (String[] args) {
		SuperHero hero1 = new ManRay (0, "Gennichiro");
		hero1.identity();
		hero1.showPowers();
		SuperHero hero2 = new FlyingDutchMan (255, "Shirai");
		hero2.identity();
		hero2.showPowers();
		SuperHero hero3 = new DirtyBubble (553, "Gyoubu Masataka Oniwa");
		hero3.identity();
		hero3.showPowers();
		
		
	}

}
