package design.pattern.construction.prototype;

public class DemandeImmatriculation extends Document {

	@Override
	public void imprime() {
		System.out.println("Imprime la demande d'immatriculation : " + this.contenu);

	}

	@Override
	public void affiche() {
		System.out.println("Affiche la demande d'immatriculation : " + this.contenu);

	}

}
