package design.pattern.comportement.templateMethod;

public abstract class Commande {

	protected double montantHt;
	protected double montantTva;
	protected double montantTtc;
	
	protected abstract void calculeTva();
	
	public void calculeMontantTtc() {
		this.calculeTva();
		this.montantTtc = this.montantHt + this.montantTva;
	}
	
	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}
	
	public void affiche() {
		System.out.println("Commande");
		System.out.println("Montant HT " + this.montantHt);
		System.out.println("Montant TTC " + this.montantTtc);
	}
}
