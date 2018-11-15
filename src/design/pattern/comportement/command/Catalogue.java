package design.pattern.comportement.command;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	protected List<Vehicule> vehiculeStock = new ArrayList<>();
	
	protected List<CommandeSolder> commandes = new ArrayList<>();
	
	public void lanceCommandeSolder(CommandeSolder commande) {
		
		commandes.add(0, commande);
		commande.sold(this.vehiculeStock);
	}
	
	public void annuleCommandeSolder(int ordre) {
		commandes.get(ordre).annule();
	}
	
	public void retablitCommandeSolder(int ordre) {
		commandes.get(ordre).retablit();
	}
	
	public void ajoute(Vehicule vehicule) {
		this.vehiculeStock.add(vehicule);
	}
	
	public void affiche() {
		for(Vehicule vehicule : this.vehiculeStock) {
			vehicule.affiche();
		}
	}
}
