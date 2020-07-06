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
		
		// String ref = liste.get(0);
		String ref = "";

		for (int i = 0; i < liste.size(); i++) {

			if (liste.get(i).length() > ref.length()) {

				ref = liste.get(i);
			}
		}

		System.out.println(ref);

		

		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());	
		}
		System.out.println("--------------- ");
		System.out.print(liste);

		Iterator<String> iterator = liste.iterator();
		while (iterator.hasNext()) {
			//if (ville.startsWith('N')
			//if (ville.charAt(0)=='N')
			if (iterator.next().substring(0, 1).equals("N")) {
				iterator.remove();
			}
		}
		System.out.println(" \n--------------- ");
		System.out.print(liste);
	}

}
