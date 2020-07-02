package fr.diginamic.jda;

import java.util.Random;

public class Personnage {

	// force (entre 12 et 18) tirée aléatoirement
	
	int force= 12 + (int) (Math.random() * 7);
	
	// points de vie (entre 20 et 50) tirés aléatoirement
	
	int vie= 20 + (int) (Math.random() * 31);
	// score (à 0)
	
	int score = 0;
}
