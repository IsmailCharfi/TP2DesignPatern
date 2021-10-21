package glace;

public class SauceChocolat extends DecorateurTopping {

	public SauceChocolat(Produit p) {
		super(p);
	}

	@Override
	public float cout() {
		return super.cout() + 0.7f;
	}

	@Override
	public String description() {
		return  super.description() + "et sa delicieuse sauce chocolat ";
	}

}
