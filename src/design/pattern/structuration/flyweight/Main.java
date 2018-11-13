package design.pattern.structuration.flyweight;

public class Main {

	public static void main(String[] args) {
		
		FabriqueOption fabrique = new FabriqueOption();
		VehiculeCommande vehiculeCommande = new VehiculeCommande();
		
		vehiculeCommande.ajouteOptions("air bag", 80, fabrique);
		vehiculeCommande.ajouteOptions("direction assisté", 90, fabrique);
		vehiculeCommande.ajouteOptions("vitre éléctrique", 85, fabrique);
		
		vehiculeCommande.afficheOptions();

	}

}
