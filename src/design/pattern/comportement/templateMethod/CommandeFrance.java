package design.pattern.comportement.templateMethod;

public class CommandeFrance extends Commande {

	@Override
	protected void calculeTva() {
		this.montantTva = this.montantHt * 0.196;

	}

}
