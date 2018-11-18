package design.pattern.comportement.state;

public class CommandeValidee extends EtatCommande {

	public CommandeValidee(Commande commande) {
		super(commande);
	}

	@Override
	public void ajouteProduit(Produit produit) {
	}

	@Override
	public void efface() {
		this.commande.getProduits().clear();
	}

	@Override
	public void retireProduit(Produit produit) {
	}

	@Override
	public EtatCommande etatSuivant() {
		return new CommandeLivree(this.commande);
	}

}
