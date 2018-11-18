package design.pattern.comportement.strategy;

public abstract class Personnage {
	
	protected String nom;
	
	protected Combat combat;
	
	protected Metier metier;
	
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	public void attaquer() {
		this.combat.attaquer();
	}
	
	public void travailler() {
		if(this.metier != null) {
			this.metier.travailler();
		} else {
			System.out.println("Vous n'avez pas de metier!");
		}
		
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
	
	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
		System.out.println("Je suis un " + this.nom + ", j'ai appris un nouveau metier :  " + metier.getMetier());
	}
	
	
}
