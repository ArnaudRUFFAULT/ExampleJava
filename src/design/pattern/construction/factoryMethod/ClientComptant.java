package design.pattern.construction.factoryMethod;

public class ClientComptant extends Client {

	@Override
	protected Commande creerCommande(double montant) {
		return new CommandeComptant(montant);
	}

}
