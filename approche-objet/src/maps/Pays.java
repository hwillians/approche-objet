package maps;

public class Pays {
	private String nom;
	private int NbHab;
	private String continent;
	public Pays(String nom, int nbHab, String continent) {
		super();
		this.nom = nom;
		NbHab = nbHab;
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Pays : " + nom + ", Nombre d'habitants :" + NbHab + ", continent=" + continent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHab() {
		return NbHab;
	}
	public void setNbHab(int nbHab) {
		NbHab = nbHab;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	

}
