package design.pattern.structuration.adaptater;

//Classe a adapter à l'application , il faut alors utiliser un adaptateur
public class ComposantPDF {
	
	protected String contenu;
	
	public void pdfFixeContenu(String contenu) {
		this.contenu = contenu;
	}
	
	public void pdfPrepareAffichage() {
		System.out.println("Affichage du PDF : Début");
	}
	
	public void pdfRafraichit() {
		System.out.println("Affichage contenu PDF : " + this.contenu);
	}
	
	public void pdfTermineAffichage() {
		System.out.println("Affichae PDF : Fin");
	}
	
	public void pdfEnvoieImprimante() {
		System.out.println("Impression PDF : " + this.contenu);
	}
}
