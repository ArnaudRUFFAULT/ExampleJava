package design.pattern.comportement.chainOfResponsability;

public class Modele extends ObjetBase {

	protected String description;
	
	protected String nom;
	
	
	public Modele( String nom, String description) {
		this.description = description;
		this.nom = nom;
	}


	@Override
	protected String getDescription() {
		
		if( this.description != null) {
			return "Modèle " + this.nom + " : " + this.description;
		}
		
		return null;
	}

}
