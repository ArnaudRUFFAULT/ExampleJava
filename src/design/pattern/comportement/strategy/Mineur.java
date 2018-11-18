package design.pattern.comportement.strategy;

public class Mineur implements Metier {

	@Override
	public void travailler() {
		System.out.println("Je mine...");

	}

	@Override
	public String getMetier() {
		return "Mineur";
	}

}
