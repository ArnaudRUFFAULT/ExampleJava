package design.pattern.construction.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Liasse {

	protected List<String> contenu = new ArrayList<>();
	
	public abstract void ajouterDocument(String document);
	
	public abstract void imprime();
}
