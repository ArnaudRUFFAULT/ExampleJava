package design.pattern.construction.prototype;

public class BonDeCommande extends Document {

	@Override
	public void imprime() {
		System.out.println("Imprime le bon de commande : " + this.contenu);

	}

	@Override
	public void affiche() {
		System.out.println("Affiche le bon de commande : " + this.contenu);

	}

}
