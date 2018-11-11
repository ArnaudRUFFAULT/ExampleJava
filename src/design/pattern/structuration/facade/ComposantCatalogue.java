package design.pattern.structuration.facade;

import java.util.ArrayList;
import java.util.List;

public class ComposantCatalogue implements Catalogue {
	
	protected Object[] descriptionVehicule = {
			"Berlins 5 portes", 6000, "Compact 3 portes", 4000,
			"Espace 5 portes", 8000, "Break 5 portes", 7000,
			"Coupé 2 portes", 9000, "Utilitaire 3 portes", 5000
	};

	@Override
	public List<String> retrouveVehicules(int prixMin, int prixMax) {
		
		int index, taille;
		List<String> resultat = new ArrayList<>();
		taille = this.descriptionVehicule.length / 2;
		for( index = 0; index < taille; index++) {
			int prix = (Integer)descriptionVehicule[2 * index + 1];
			if( prix >= prixMin && prix <= prixMax) {
				resultat.add((String)descriptionVehicule[2 * index]);
			}
		}
		return resultat;
	}

}
