package design.pattern.structuration.flyweight;

import java.util.ArrayList;
import java.util.List;

public class VehiculeCommande {

	protected List<OptionVehicule> options = new ArrayList<>();
	
	protected List<Integer> prixDeVente = new ArrayList<>();
	
	public void ajouteOptions(String nom, int prixDeVente, FabriqueOption fabrique) {
		this.options.add(fabrique.getOption(nom));
		this.prixDeVente.add(prixDeVente);
	}
	
	public void afficheOptions() {
		
		int index, taille;
		
		taille = this.options.size();
		
		for(index = 0; index < taille; index++) {
			this.options.get(index).affiche(this.prixDeVente.get(index));
			System.out.println();
		}
	}
}
