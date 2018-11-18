package design.pattern.comportement.visitor;

public abstract class Societe {

	protected String nom, email, adresse;

	public Societe(String nom, String email, String adresse) {
		this.setNom(nom);
		this.setEmail(email);
		this.setAdresse(adresse);
	}
	
	public abstract boolean ajouteFiliale(Societe filiale);
	
	public abstract void accepteVisiteur(Visiteur visiteur);

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
