package design.pattern.comportement.strategy;

public class BatonMagique implements Combat {

	@Override
	public void attaquer() {
		System.out.println("J'attaque avec mon bâton magique à distance");

	}

	@Override
	public String getArme() {
		return "Bâton magique";
	}

}
