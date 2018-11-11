package design.pattern.structuration.adaptater;

public class DocumentPDF implements Document {

	protected ComposantPDF outilPDF = new ComposantPDF();
	
	@Override
	public void setContenu(String contenu) {
		this.outilPDF.pdfFixeContenu(contenu);

	}

	@Override
	public void dessine() {
		this.outilPDF.pdfPrepareAffichage();
		this.outilPDF.pdfRafraichit();
		this.outilPDF.pdfTermineAffichage();

	}

	@Override
	public void imprime() {
		this.outilPDF.pdfEnvoieImprimante();

	}

}
