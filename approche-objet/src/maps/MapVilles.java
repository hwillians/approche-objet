package maps;

import java.util.HashMap;
import java.util.Iterator;


public class MapVilles {

	public static void main(String[] args) {
	
	
	HashMap<Integer, String> mapVilles = new HashMap<>(); 
	mapVilles.put(13, "Marseille");
	mapVilles.put(34, "Montpellier");
	mapVilles.put(44, "Nantes");
	mapVilles.put(75, "Paris"); 
	mapVilles.put(31, "Toulouse");
	mapVilles.put(59, "Lille");
	mapVilles.put(69, "Lyon");
	mapVilles.put(33, "Bordeaux");
	
	Iterator<Integer> valuesIte = mapVilles.keySet().iterator(); 
	while (valuesIte.hasNext()) {
		Integer dep = valuesIte.next();
		System.out.println(dep);
		}

	System.out.println(" \n--------------- ");
	Iterator<Integer> Ite = mapVilles.keySet().iterator(); 
	while (Ite.hasNext()) {
		Integer dep = Ite.next();
		System.out.println(mapVilles.get(dep));
		}
	
	System.out.println(" \n--------------- ");
	System.out.println(mapVilles.size());
	
	}
	
	//Exercice 4
	
	
	

}
