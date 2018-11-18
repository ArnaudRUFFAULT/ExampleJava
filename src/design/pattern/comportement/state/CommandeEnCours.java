package design.pattern.comportement.state;

public class CommandeEnCours extends EtatCommande {

	public CommandeEnCours(Commande commande) {
		super(commande);
	}

	@Override
	public void ajouteProduit(Produit produit) {
		this.commande.getProduits().add(produit);

	}

	@Override
	public void efface() {
		this.commande.getProduits().clear();

	}

	@Override
	public void retireProduit(Produit produit) {
		this.commande.getProduits().remove(produit);

	}

	@Override
	public EtatCommande etatSuivant() {
		return new CommandeValidee(this.commande);
	}

}
