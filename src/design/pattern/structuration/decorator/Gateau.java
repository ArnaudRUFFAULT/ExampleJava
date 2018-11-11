package design.pattern.structuration.decorator;

public class Gateau implements Patisserie {
	
	protected String nom;
	
	protected double prix;
	
	public Gateau(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	@Override
	public double calculerPrix() {
		return this.prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
