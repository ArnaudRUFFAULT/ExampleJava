package design.pattern.comportement.command;

public class Vehicule {
	
	protected String name;
	protected long dateEntreeStock;
	protected double prixVente;
	
	public Vehicule(String name, long dateEntreeStock, double prixVente) {
		this.name = name;
		this.dateEntreeStock = dateEntreeStock;
		this.prixVente = prixVente;
	}
	
	public long getDureeStockage(long aujourdhui) {
		return aujourdhui - this.dateEntreeStock;
	}
	
	public void modifiePrix(double coefficient) {
		this.prixVente = 0.01 * Math.round(coefficient * this.prixVente * 100);
	}
	
	public void affiche() {
		System.out.println(this.name + ", prix : " + this.prixVente + ", date entrée Stock : " + this.dateEntreeStock);
	}
}
