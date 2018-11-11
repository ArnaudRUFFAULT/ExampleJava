package design.pattern.construction.abstractFactory;

public class ScooterElectricite extends Scooter {

	public ScooterElectricite(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void afficheCaracteristique() {
		System.out.println("Scooter éléctrique:  \n\tmodele : " + this.modele + "\n\tcouleur : " + this.couleur + "\n\tpuissance : " + this.puissance);
	}

}
