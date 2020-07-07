package fr.diginamic.recensement.entites;

public class Categorie {	
	
	private String nom;
	private Integer population;
	
	/**
	 * @param nom
	 * @param population
	 */
	public Categorie(String nom, Integer population) {
		super();
		this.nom = nom;
		this.population = population;
	}
	
	
	@Override
	public String toString() {
		return nom + " population =" + population;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(Integer population) {
		this.population = population;
	}
	
	
	
	
	
}
