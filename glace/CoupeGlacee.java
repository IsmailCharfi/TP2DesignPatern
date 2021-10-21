package glace;

import java.util.*;

public abstract class CoupeGlacee extends Produit {

	protected List<Parfum> parfums;

	protected CoupeGlacee() {
		this.parfums = new ArrayList<Parfum>();
	}

	public String description() {
		StringBuffer sb = new StringBuffer("");
		for (Iterator<Parfum> it = parfums.iterator(); it.hasNext();) {
			sb.append(it.next().toString());
			sb.append(" ");
		}
		return sb.toString();
	}

	public abstract float cout();
}