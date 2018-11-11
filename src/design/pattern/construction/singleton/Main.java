package design.pattern.construction.singleton;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation du vendeur du système
		Vendeur vendeur = Vendeur.getInstance();
		
		vendeur.setAdresse("101 rue des Lilas");
		vendeur.setEmail("arnaud@mail.com");
		vendeur.setNom("Arnaud");
		
		vendeur.affiche();
		
		Vendeur vendeur2 = Vendeur.getInstance();
		vendeur2.setNom("Ronan");
		
		vendeur.affiche();
		
		System.out.println(vendeur.equals(vendeur2));
	}

}
