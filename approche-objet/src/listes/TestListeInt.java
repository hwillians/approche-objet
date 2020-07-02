package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> listeIm = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		List<Integer> liste = new ArrayList<>();
		liste.addAll(listeIm);

		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + " ");

		}
		
		System.out.println(" \n--------------- ");
		
		System.out.println(liste.size());
		
		System.out.println(" \n--------------- ");
		
		Integer max = 0;

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) > max) {
				max = liste.get(i);
			}
		}

		System.out.println(max);
		System.out.println(" \n--------------- ");
		Integer min = 0;

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < min) {
				min = liste.get(i);
			}
		}

		liste.remove(min);

		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + " ");
		}

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i)<0) {
				liste.set(i, -liste.get(i));
			}
		}
		System.out.println(" \n--------------- ");
		for (int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + " ");

		}
	}

}
