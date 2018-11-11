package design.pattern.construction.builder;

public class LiassePDF extends Liasse {

	@Override
	public void ajouterDocument(String document) {
		
		if(document.startsWith("<PDF>")) {
			contenu.add(document);
		}
	}

	@Override
	public void imprime() {
		
		System.out.println("Liasse PDF");
		for(String document : contenu) {
			System.out.println("\n\t" + document);
		}

	}

}
