package design.pattern.structuration.decorator;

public class BougiesDecorator extends PatisserieDecorator implements Patisserie {

	public BougiesDecorator(Patisserie patisserie) {
		super(patisserie);
	}

	@Override
	public double calculerPrix() {
		return this.patisserie.calculerPrix() + 1.5;
	}

	@Override
	public String toString() {
		return this.patisserie.toString() + ", accessoirisé de bougies";
	}

}
