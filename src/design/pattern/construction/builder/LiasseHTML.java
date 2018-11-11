package design.pattern.construction.builder;

public class LiasseHTML extends Liasse {

	@Override
	public void ajouterDocument(String document) {
		
		if(document.startsWith("<HTML>")) {
			contenu.add(document);
		}
	}

	@Override
	public void imprime() {
		
		System.out.println("Liasse HTML");
		for(String document : contenu) {
			System.out.println("\n\t" + document);
		}

	}

}
