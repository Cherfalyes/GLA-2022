import java.util.Set;

public class Hôtel {
	
	// Attributs
	private String adresse ;
	private int nbChambres = 0;
	private String catégorie;
	
	// Attributs (qui étaient des associations dans le diagramme de classes)
	private Set<Employé> employés;
	private Set<Chambre> chambres;
	private Set<Personne> personnes;
	private Set<Personnel> personnel;
	
	// Getters : 
	public String getAdress() {
		return adresse;
	}
	public int getNbChambres() {
		return nbChambres;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public Set<Employé> getEmployés() {
		return employés;
	}
	public Set<Chambre> getChambres() {
		return chambres;
	}
	
	public Set<Personne> getPersonnes() {
		return personnes;
	}
	public Set<Personnel> getPersonnel() {
		return personnel;
	}
	
	// Setters : 
	public void setAdress(String adresse) {
		this.adresse = adresse;
	}
	public void setNbChambres(int nbChambres) {
		this.nbChambres = nbChambres;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public void setEmployés(Set<Employé> employés) {
		this.employés = employés;
	}
	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}
	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}
	public void setPersonnel(Set<Personnel> personnel) {
		this.personnel = personnel;
	}
	
	//Méthodes : ensemble d'opérations relatives à chaque classe
	public float chiffreAffaire() {
		// traitement pour calculer le chiffre d'affaire
		
		// retour de la valeur
		return 0;
	}
	
	
	
	
	

}
