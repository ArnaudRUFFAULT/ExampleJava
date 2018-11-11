package design.pattern.construction.singleton;

public class Vendeur {

	protected String nom;
	protected String adresse;
	protected String email;
	
	private static Vendeur _instance = null;
	
	private Vendeur() {
		
	}
	
	public static Vendeur getInstance() {
		
		if(_instance == null) {
			_instance = new Vendeur();
		}
		
		return Vendeur._instance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void affiche() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Adresse : " + this.adresse);
		System.out.println("Email : " + this.email);
	}
	
	
}
