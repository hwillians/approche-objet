package maps;

import java.util.HashMap;
import java.util.Map;

public class MapSalaires {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Ingrid", 2015);
		map.put("Yu", 2250);
		map.put("Chantal", 2418);
		
		System.out.println(map.size());
	}

}
