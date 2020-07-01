package esseis;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme item) {

		System.out.println("le périmètre de la forme est : " + item.calculerPerimetre() + " et sa sourface :"
				+ item.calculerSurface());
	}

}
