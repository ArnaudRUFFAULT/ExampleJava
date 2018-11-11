package design.pattern.structuration.facade;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
		System.out.println(webServiceAuto.document(1));
		System.out.println(webServiceAuto.document(2));
		List<String> resultats = webServiceAuto.chercheVehicules(1000, 6000);
		if(resultats.size() > 0) {
			System.out.println("Véhicule dont le prix est compris entre 1000 et 6000");
			for(String resultat : resultats) {
				System.out.println(" " + resultat);
			}
		}

	}

}
