package design.pattern.comportement.chainOfResponsability;

public class Marque extends ObjetBase {
	
	protected String description1, description2;
	protected String nom;

	public Marque(String nom, String description1, String description2) {
		this.description1 = description1;
		this.description2 = description2;
		this.nom = nom;
	}

	@Override
	protected String getDescription() {
		
		if(this.description1 != null && this.description2 != null) {
			return "Modèle " + this.nom + " : " + this.description1 + ", " + this.description2; 
			
		} else if (this.description1 != null) {
			return "Modèle " + this.nom + " : " + this.description1;
			
		} else {
			return null;
		}
	}

}
