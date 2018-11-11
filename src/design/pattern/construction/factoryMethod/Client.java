package design.pattern.construction.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

	protected List<Commande> commandes = new ArrayList<>();
	
	protected abstract Commande creerCommande(double montant);
	
	public void nouvelleCommande(double montant) {
		Commande commande = this.creerCommande(montant);
		if(commande.valide()) {
			commande.paye();
			commandes.add(commande);
		}
	}
}
