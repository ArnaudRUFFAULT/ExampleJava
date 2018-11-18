package design.pattern.comportement.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {

	protected List<Observateur> observateurs = new ArrayList<>();
	
	public void ajoute(Observateur observateur) {
		this.observateurs.add(observateur);
	}
	
	public void retire(Observateur observateur) {
		this.observateurs.remove(observateur);
	}
	
	public void notifie() {
		for(Observateur observateur : this.observateurs) {
			observateur.actualise();
		}
	}
}
