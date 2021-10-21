

import java.util.*;
import glace.*;

public class Commande {

	public List<Produit> lesProd;

	Commande() {
		lesProd = new ArrayList<Produit>();
	}

	public void publieFacture() {
		float total = 0;
		for (Iterator<Produit> it = this.lesProd.iterator(); it.hasNext();) {
			Produit p = (Produit) it.next();
			System.out.println(p.description() + " + " + p.cout() );
			total = total + p.cout();
		}
		System.out.println("\nTOTAL : " + total);
	}
	
    public void addCoupe(Produit c) { lesProd.add(c); }

}
