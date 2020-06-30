package entites;

public class Personne {

	private String nom;
	private String prenom;
	public AdressePostale adresse;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// Dans la classe Personne, ajoutez une méthode qui permet d’afficher le nom et
	// le prénom avec le nom de famille en majuscules (maString =
	// maString.toUperCase()).

	public void afficherIdentite() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	// ajoutez une méthode qui prend un argument en paramètre et permet de modifier
	// la variable d’instance nom de Personne.
	public void modifierNom(String nvNom) {
		nom = nvNom;
	}

	// ajoutez une méthode similaire pour modifier le prénom.
	public void modifierPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}

	// ajoutez une méthode similaire pour modifier l’adresse.
	public void modifierAdresse(AdressePostale nvAdresse) {
		adresse = nvAdresse;
	}

	// ajoutez une méthode qui retourne le nom.
	public String nom() {
		return nom;
	}

	// ajoutez une méthode qui retourne le prénom.
	public String preNom() {
		return prenom;
	}

	// ajoutez une méthode qui retourne l’adresse.
	public AdressePostale afficherAdresse() {
		return adresse;
	}

}
