package design.pattern.comportement.templateMethod;

public class CommandeLuxembourg extends Commande {

	@Override
	protected void calculeTva() {
		this.montantTva = this.montantHt * 0.15;

	}

}
