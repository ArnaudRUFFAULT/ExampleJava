package design.pattern.comportement.strategy;

public class Mage extends Personnage {
	
	public Mage() {
		super("Mage");
		this.combat = new BatonMagique();
	}

}
