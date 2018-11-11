package design.pattern.construction.prototype;

import java.util.ArrayList;
import java.util.List;

public class LiasseClient extends Liasse {

	public LiasseClient(String informations) {

		documents = new ArrayList<Document>();

		List<Document> documentsVierges = LiasseVierge.Instance().getDocuments();

		for (Document doc : documentsVierges) {
			Document copieDocument = doc.duplique();
			copieDocument.remplit(informations);
			documents.add(copieDocument);
		}
	}

	public void affiche() {

		for (Document doc : this.documents) {
			doc.affiche();
		}
	}

	public void imprime() {

		for (Document doc : this.documents) {
			doc.imprime();
		}
	}
}
