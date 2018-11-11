package design.pattern.structuration.decorator;

public abstract class PatisserieDecorator implements Patisserie {
	
	protected Patisserie patisserie;
	
	public PatisserieDecorator(Patisserie patisserie) {
		this.patisserie = patisserie;
	}

	@Override
	public abstract double calculerPrix();
	
	@Override
	public abstract String toString();
}
