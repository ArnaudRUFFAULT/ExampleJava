package design.pattern.construction.abstractFactory;

public class AutomobileElectrecite extends Automobile {

	public AutomobileElectrecite(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristique() {
		System.out.println("Automobile éléctrique:  \n\tmodele : " + this.modele + "\n\tcouleur : " + this.couleur + "\n\tpuissance : " + this.puissance + "\n\tEspace : " + this.espace);
	}
	
	

}
