package design.pattern.structuration.composite;

public class Main {

	public static void main(String[] args) {
		
		Societe societe1 = new SocieteSansFiliale();
		societe1.ajouteVehicule();
		
		System.out.println("Coût entretien total société1 : " + societe1.calculeCoutEntretien());
		
		Societe societe2 = new SocieteSansFiliale();
		societe2.ajouteVehicule();
		societe2.ajouteVehicule();
		
		System.out.println("Coût entretien total société2 : " + societe2.calculeCoutEntretien());
		
		Societe groupe = new SocieteMere();
		groupe.ajouteFiliale(societe1);
		groupe.ajouteFiliale(societe2);
		groupe.ajouteVehicule();
		groupe.ajouteVehicule();
		groupe.ajouteVehicule();
		
		System.out.println("Coût entretien total du groupe : " + groupe.calculeCoutEntretien());

	}

}
