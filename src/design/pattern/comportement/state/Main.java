package design.pattern.comportement.state;

public class Main {

	public static void main(String[] args) {
		
		Commande commande = new Commande();
		commande.ajouteProduit(new Produit("PS4"));
		commande.ajouteProduit(new Produit("Red Dead Redemption II"));
		commande.affiche();
		commande.etatSuivant();
		commande.ajouteProduit(new Produit("Le respect"));
		commande.affiche();
		commande.efface();
		commande.etatSuivant();
	}

}
