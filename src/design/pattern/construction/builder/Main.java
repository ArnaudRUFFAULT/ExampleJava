package design.pattern.construction.builder;

public class Main {

	public static void main(String[] args) {
		
		Vendeur vendeur = new Vendeur(new ConstructeurLiasseVehiculeHTML());
		Liasse liasse = vendeur.construit("Arnaud");
		liasse.imprime();
		
		Vendeur vendeur2 = new Vendeur(new ConstructeurLiasseVehiculePDF());
		Liasse liasse2 = vendeur2.construit("Ronan");
		liasse2.imprime();
	}

}
