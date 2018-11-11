package design.pattern.structuration.bridge;

public abstract class FormulaireImmatriculation {

	protected String contenu;

	protected FormulaireImpl implantation;

	public FormulaireImmatriculation(FormulaireImpl implantation) {
		this.implantation = implantation;
	}
	
	public void affiche() {
		this.implantation.dessineTexte("numéro de la plaque existante : ");
	}
	
	public void genereDocument() {
		this.implantation.dessineTexte("Demande d'immatriculation");
		this.implantation.dessineTexte("numéro de plaque : " + this.contenu);
	}
	
	protected abstract boolean controleSaisie(String plaque);
	
	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
