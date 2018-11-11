package design.pattern.construction.prototype;

import java.util.ArrayList;

public class LiasseVierge extends Liasse {
	
	private static LiasseVierge _instance = null;
	
	private LiasseVierge() {
		this.documents = new ArrayList<Document>();
	}
	
	public static LiasseVierge Instance() {
		if(_instance == null) {
			_instance = new LiasseVierge();
		}
		return LiasseVierge._instance;
	}
	
	public void ajoute(Document doc) {
		this.documents.add(doc);
	}
	
	public void retire(Document doc) {
		this.documents.remove(doc);
	}

}
