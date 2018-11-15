package design.pattern.comportement.iterator;

public class Main {

	public static void main(String[] args) {
		
		CatalogueVehicule catalogue = new CatalogueVehicule();
		IterateurVehicule iterateur = catalogue.recherche("qualité");
		
		Vehicule vehicule;
		iterateur.debut();
		vehicule = iterateur.item();
		
		while( vehicule != null) {
			vehicule.affiche();
			iterateur.suivant();
			vehicule = iterateur.item();
		}

	}

}
