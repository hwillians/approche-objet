package esseis;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Cercle forme1 = new Cercle(5);
		Rectangle forme2 = new Rectangle(3, 4);
		Carre forme3 = new Carre(5);

		AffichageForme.afficher(forme1);
		AffichageForme.afficher(forme2);
		AffichageForme.afficher(forme3);

	}

}
