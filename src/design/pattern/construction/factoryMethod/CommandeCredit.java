package design.pattern.construction.factoryMethod;

public class CommandeCredit extends Commande {

	public CommandeCredit(double montant) {
		super(montant);
	}

	@Override
	public boolean valide() {
		
		return (montant >= 1000.0 && montant <= 5000.0);
	}

	@Override
	public void paye() {
		System.out.println("Le paiment de la commande au crédit de : " + this.montant + " est effectué");

	}

}
