package fr.diginamic.operations;

public class CalculMoyenne {

	private static double[] tabNombres = new double[10];

	public CalculMoyenne() {
	}

	public static void ajout(double nombre) {
		for (int i = 0; i < tabNombres.length; i++) {
			if (tabNombres[i] == 0) {
				tabNombres[i] = nombre;
				return;
			}
		}
	}

	public static double calcul() {
		double somme = 0;
		double items= 0;
		for (int i = 0; i < tabNombres.length; i++) {
			if (tabNombres[i] != 0) {somme += tabNombres[i];
			items++;
			}
		}
		return somme / items;
	}

	public double[] getTabNombres() {
		return tabNombres;
	}

	public void setTabNombres(double[] tabNombres) {
		this.tabNombres = tabNombres;
	}

}
