package design.pattern.comportement.strategy;

public abstract class Personnage {
	
	protected String nom;
	
	protected Combat combat;
	
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	public void attaquer() {
		this.combat.attaquer();
	}
	
	public void description() {
		System.out.println("Classe : " + this.nom + ", Arme : "  + this.combat.getArme());
	}

	public Combat getCombat() {
		return combat;
	}

	public void setCombat(Combat combat) {
		this.combat = combat;
		System.out.println("Je suis un " + this.nom + ", je m'équipe d'une nouvelle arme : " + combat.getArme());
	}
	
	
}
