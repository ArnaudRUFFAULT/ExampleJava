package design.pattern.construction.abstractFactory;

public class AutomobileEssence extends Automobile {

	public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristique() {
		System.out.println("Automobile à essence:  \n\tmodele : " + this.modele + "\n\tcouleur : " + this.couleur + "\n\tpuissance : " + this.puissance + "\n\tEspace : " + this.espace);
	}

}
