package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tabNombres = null;

	private int k = tabNombres.length;

	public CalculMoyenne() {
	}

	public void ajout(double nombre) {
		double[] tabTemp = new double[k + 1];
		for (int i = 0; i < tabTemp.length - 1; i++) {
			tabTemp[i] = tabNombres[i];
		}
		
		tabTemp[tabTemp.length - 1] = nombre;
		tabNombres = tabTemp;
	}


	

	public double calcul() {
		double moyen = 0;
		for (int i = 0; i < k; i++) {
			moyen += tabNombres[i];
		}
		return moyen;
	}

	public double[] getTabNombres() {
		return tabNombres;
	}

	public void setTabNombres(double[] tabNombres) {
		this.tabNombres = tabNombres;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
}
