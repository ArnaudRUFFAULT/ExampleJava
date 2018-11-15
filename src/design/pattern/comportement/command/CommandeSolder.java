package design.pattern.comportement.command;

import java.util.ArrayList;
import java.util.List;

public class CommandeSolder {

	protected List<Vehicule> vehiculeSoldes = new ArrayList<>();
	
	protected long aujourdhui;
	
	protected long dureeStock;
	
	protected double tauxRemise;

	public CommandeSolder(long aujourdhui, long dureStock, double tauxRemise) {
		this.aujourdhui = aujourdhui;
		this.dureeStock = dureStock;
		this.tauxRemise = tauxRemise;
	}
	
	public void sold(List<Vehicule> vehicules) {
		this.vehiculeSoldes.clear();
		for(Vehicule vehicule : vehicules) {
			if(vehicule.getDureeStockage(this.aujourdhui) >= this.dureeStock) {
				this.vehiculeSoldes.add(vehicule);
			}
		}
		
		for(Vehicule vehicule : this.vehiculeSoldes) {
			vehicule.modifiePrix(1.0 - this.tauxRemise);
		}
	}
	
	public void annule() {
		for(Vehicule vehicule : this.vehiculeSoldes) {
			vehicule.modifiePrix(1.0 / (1.0 - tauxRemise));
		}
	}
	
	public void retablit() {
		for(Vehicule vehicule : this.vehiculeSoldes) {
			vehicule.modifiePrix(1.0 - tauxRemise);
		}
	}
	
}
