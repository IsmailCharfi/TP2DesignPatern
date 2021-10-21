package glace;

public class DecorateurTopping  extends Produit{
	
	protected Produit produit;

	DecorateurTopping (Produit produit){
		this.produit = produit;
	}
	
	public float cout() {
		return produit.cout();
	}

	public String description() {
		return produit.description();
	}
	
}
