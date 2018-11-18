package design.pattern.comportement.state;

public class Produit {

	protected String nom;

	public Produit(String nom) {
		this.nom = nom;
	}
	
	public void affiche() {
		System.out.println("Produit : " + this.nom);
	}
	
}
