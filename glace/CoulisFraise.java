package glace;

public class CoulisFraise extends DecorateurTopping{

	CoulisFraise(Produit p) {
		super(p);
	}

	@Override
	public float cout() {
		return super.cout() + 1;
	}

	@Override
	public String description() {
		return super.description() + "au coulis de fraises fraiches ";
	}

}
