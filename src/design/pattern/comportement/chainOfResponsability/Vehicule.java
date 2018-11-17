package design.pattern.comportement.chainOfResponsability;

public class Vehicule extends ObjetBase {
	
	protected String description;

	public Vehicule(String description) {
		this.description = description;
	}



	@Override
	protected String getDescription() {
		return this.description;
	}

}
