package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] tabGeo = new ObjetGeometrique[2];

		tabGeo[0] = new Cercle(2.5);
		tabGeo[1] = new Rectangle(2, 4);

		for (int i = 0; i < tabGeo.length; i++) {
			System.out.println("Le perimètre du " + tabGeo[i].getType() + "  est " + tabGeo[i].perimetre()
					+ " et sa surface est  " + tabGeo[i].surface());
		}

	}

}
