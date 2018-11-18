package design.pattern.comportement.observer;


public class VueVehicule implements Observateur {
	
	protected Vehicule vehicule;
	protected String texte = "";

	public VueVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
		vehicule.ajoute(this);
		this.metAJourTexte();
	}

	protected void metAJourTexte() {
		this.texte = "Description " + this.vehicule.getDescription() + ", Prix : " + this.vehicule.getPrix();
	}

	@Override
	public void actualise() {
		this.metAJourTexte();
		this.redessine();
	}
	
	public void redessine() {
		System.out.println(this.texte);
	}

}
