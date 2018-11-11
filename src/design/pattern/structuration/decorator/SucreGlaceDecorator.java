package design.pattern.structuration.decorator;

public class SucreGlaceDecorator extends PatisserieDecorator {

	public SucreGlaceDecorator(Patisserie patisserie) {
		super(patisserie);
	}

	@Override
	public double calculerPrix() {
		return this.patisserie.calculerPrix() + 2.0;
	}

	@Override
	public String toString() {
		return this.patisserie.toString() + ", soupoudré de sucre glace";
	}

}
