package design.pattern.construction.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		Client clientComptant;
		clientComptant = new ClientComptant();
		clientComptant.nouvelleCommande(300);
		clientComptant.nouvelleCommande(2000);
		clientComptant.nouvelleCommande(10000);
		
		
		Client clientCredit;
		clientCredit = new ClientCredit();
		clientCredit.nouvelleCommande(425.36);
		clientCredit.nouvelleCommande(3694);
		clientCredit.nouvelleCommande(12563.98);
	}

}
