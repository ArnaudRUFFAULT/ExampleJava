package design.pattern.comportement.strategy;

public class Forgeron implements Metier {

	@Override
	public void travailler() {
		System.out.println("Je forge...");

	}

	@Override
	public String getMetier() {
		return "Forgeron";
	}

}
