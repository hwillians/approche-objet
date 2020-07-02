package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> listeIm = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille",
				"Tarbes");
		List<String> liste = new ArrayList<>();
		liste.addAll(listeIm);

		// length()
		int taille = 0;
		int temoin = 0;

		for (int i = 0; i < liste.size(); i++) {

			if (liste.get(i).length() > taille) {

				temoin = i;
				taille = liste.get(i).length();
			}
		}

		System.out.println(liste.get(temoin));

		System.out.println("--------------- ");

		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
			System.out.print(liste.get(i) + ", ");
		}

		// Iterator<User> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// User myUser = iterator.next(); System.out.println(myUser);
		// }

		// substring(int start, int end)

		Iterator<String> iterator = liste.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().substring(0, 1).equals("N")) {
				iterator.remove();
			}
		}
		System.out.println(" \n--------------- ");
		for (int i = 0; i < liste.size(); i++) {

			System.out.print(liste.get(i) + ", ");
		}

	}

}
