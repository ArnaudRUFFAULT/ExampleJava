package design.pattern.structuration.adaptater;

public class DocumentHTML implements Document {
	
	protected String contenu;

	@Override
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public void dessine() {
		System.out.println("Dessine document HTML : " + this.contenu);

	}

	@Override
	public void imprime() {
		System.out.println("Imprime document HTML : " + this.contenu);
	}

}
