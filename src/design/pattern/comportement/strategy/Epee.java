package design.pattern.comportement.strategy;

public class Epee implements Combat {

	@Override
	public void attaquer() {
		System.out.println("J'attaque avec mon epee au corps à corps");

	}

	@Override
	public String getArme() {
		return "Epee";
	}

}
