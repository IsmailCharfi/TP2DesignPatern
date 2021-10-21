package glace;

public class Chantilly extends DecorateurTopping {
	
	public Chantilly(Produit p) {
		super(p);
	}

	public float cout() {
		return super.cout() + 0.5f;
		
	}
	
	public String description() {
		return super.description() + "chantilly ";
		
	}

}
