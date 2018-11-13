package design.pattern.structuration.flyweight;

public class OptionVehicule {

	protected String nom;
	protected String description;
	protected int prixStandard;
	
	public OptionVehicule(String nom) {
		this.nom = nom;
		this.description = "Description de " + nom;
		this.prixStandard = 100;
	}
	
	public void affiche(int prixDeVente) {
		System.out.println("Option " + this.nom);
		System.out.println(this.description);
		System.out.println("Prix standard :" + this.prixStandard);
		System.out.println("Prix de vente :" + prixDeVente);
	}
	
	
}
