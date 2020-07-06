package fr.diginamic.recensement.entites;

public class Ville implements Categorie {

	// code région
	private String codeRegion;
	// nom de la région
	private String region;
	// code département
	private String codeDep;
	// code de la commune
	private String codeCommune;
	// nom de la commune
	private String commune;
	// population totale
	private int population;

	/**
	 * @param codeRegion
	 * @param region
	 * @param codeDep
	 * @param codeCommune
	 * @param commune
	 * @param population
	 */
	public Ville(String codeRegion, String region, String codeDep, String codeCommune, String commune, int population) {
	
		this.codeRegion = codeRegion;
		this.region = region;
		this.codeDep = codeDep;
		this.codeCommune = codeCommune;
		this.commune = commune;
		this.population = population;
	}

	
	
	@Override
	public String toString() {
		return "Commune= " + commune + "code de Region= " + codeRegion + ", Region= " + region + ", code du Departement= " + codeDep + ", code De commune="
				+ codeCommune +  ", population=" + population;
	}



	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}

	/**
	 * @param codeDep the codeDep to set
	 */
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * @return the commune
	 */
	public String getCommune() {
		return commune;
	}

	/**
	 * @param commune the commune to set
	 */
	public void setCommune(String commune) {
		this.commune = commune;
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
	public void setPopulation(int population) {
		this.population = population;
	}

}
