package design.pattern.construction.factoryMethod;

public class ClientCredit extends Client {

	@Override
	protected Commande creerCommande(double montant) {
		
		return new CommandeCredit(montant);
	}

}
