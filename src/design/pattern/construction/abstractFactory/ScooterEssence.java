package design.pattern.construction.abstractFactory;

public class ScooterEssence extends Scooter {

	public ScooterEssence(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void afficheCaracteristique() {
		System.out.println("Scooter à essence:  \n\tmodele : " + this.modele + "\n\tcouleur : " + this.couleur + "\n\tpuissance : " + this.puissance);
	}

}
