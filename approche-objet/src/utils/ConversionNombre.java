package utils;

public class ConversionNombre {

	public static void main(String[] args) {

		String chaine = "12";
		String chaine2 = "20";
		System.out.println(chaine);

		int nb = Integer.parseInt(chaine);
		int nb2 = Integer.valueOf(chaine2);
		System.out.println(nb);

		int max2 = Integer.max(nb, nb2);
		System.out.println("Le valeur max est : " + max2);

		int a = 10;
		int b = 14;

		int max = Integer.max(a, b);

		System.out.println("Le valeur max est : " + max);

	}

}
