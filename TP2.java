import glace.*;


public class TP2 {
	
	public static void main(String[] args) {
		
		Commande cmd  = new Commande();
		
		Produit glace =  new SauceChocolat(new Chantilly(TripleChocolat.SINGLETON));
		Cafe cafe = new Cafe("cafe lait");
		
		cmd.lesProd.add(glace);
		cmd.lesProd.add(cafe);
		
		
		cmd.publieFacture();
	}

}
