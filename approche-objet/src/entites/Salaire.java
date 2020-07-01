package entites;

public class Salaire {

	public static void main(String[] args) {

		String nom;
		String prenom;
		double salaire;

		String chaine = "Durand;Marcel;2 523.5";

		String[] morceaux = chaine.split(";");

		nom = morceaux[0];
		prenom = morceaux[1];
		salaire = Double.parseDouble(morceaux[2].replace(" ", ""));

		System.out.println(nom + " " + prenom + " " + salaire);

	}

}
