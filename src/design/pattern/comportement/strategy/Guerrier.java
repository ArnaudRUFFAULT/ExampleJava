package design.pattern.comportement.strategy;

public class Guerrier extends Personnage {

	public Guerrier() {
		super("Guerrier");
		this.combat = new Epee();
	}

}
