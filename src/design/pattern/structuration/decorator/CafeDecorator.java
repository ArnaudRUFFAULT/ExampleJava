package design.pattern.structuration.decorator;

public class CafeDecorator extends PatisserieDecorator implements Patisserie {

	public CafeDecorator(Patisserie patisserie) {
		super(patisserie);
	}

	@Override
	public double calculerPrix() {
		return this.patisserie.calculerPrix() + 3.2;
	}

	@Override
	public String toString() {
		return this.patisserie.toString() + ", accompagné d'un café noir";
	}

}
