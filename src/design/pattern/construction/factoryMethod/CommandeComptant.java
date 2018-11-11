package design.pattern.construction.factoryMethod;

public class CommandeComptant extends Commande {

	public CommandeComptant(double montant) {
		super(montant);
	}

	@Override
	public boolean valide() {
		
		return true;
	}

	@Override
	public void paye() {
		System.out.println("Le paiment de la commande au comptant de : " + this.montant + " est effectué");

	}

}
