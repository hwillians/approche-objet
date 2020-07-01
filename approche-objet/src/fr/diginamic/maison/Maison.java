package fr.diginamic.maison;

public class Maison {

	public static Piece[] tabMaison = new Piece[10];

	public static void ajouterPiece(Piece piece) {
		for (int i = 0; i < tabMaison.length; i++) {
			if (tabMaison[i] == null) {
				tabMaison[i] = piece;
				return;
			}
		}
	}

	public static double getSuperficieTotale() {
		double superficie = 0;
		for (int i = 0; i < tabMaison.length; i++) {
			if (tabMaison[i] != null && tabMaison[i].superficie > 0) {
				superficie += tabMaison[i].superficie;
			}
		}
		return superficie;
	}

	public static double getsSuperficieParEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < tabMaison.length; i++) {
			if (tabMaison[i] != null && tabMaison[i].etage == etage && tabMaison[i].superficie > 0) {
				superficie += tabMaison[i].superficie;
			}
		}
		return superficie;
	}
	
	public static double getsSuperficieParPiece(String typePiece) {
		double superficie=0;
		 for (int i = 0; i < tabMaison.length; i++) {
		if (tabMaison[i] != null && tabMaison[i].getType().equals(typePiece) &&
		 tabMaison[i].superficie > 0) {
		 superficie += tabMaison[i].superficie;
		 }
		 }
		return superficie;
	}

}
