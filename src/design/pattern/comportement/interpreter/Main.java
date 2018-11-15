package design.pattern.comportement.interpreter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Expression expressionRequete = null;

		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez votre requête : ");
		String requete = reader.nextLine();

		try {
			expressionRequete = Expression.analyse(requete);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			expressionRequete = null;
		}

		if (expressionRequete != null) {
			System.out.println("Entrez le texte de description d'un vehicule : ");
			String description = reader.nextLine();
			if (expressionRequete.evalue(description)) {
				System.out.println("La description correspond à votre requête");
			} else {
				System.out.println("La description ne répond pas à la requête");
			}
		}
	}

}
