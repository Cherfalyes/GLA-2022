import java.util.Set;

public class Personne {
	// Attributs
	private String nom, prénom, age;
	private Set<Réservation> réservations;
	private Set<Hôtel> hôtels;

	// Getters
	public String getNom() {
		return nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public String getAge() {
		return age;
	}
	public Set<Réservation> getRéservations() {
		return réservations;
	}
	public Set<Hôtel> getHôtels() {
		return hôtels;
	}
	
	// Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setRéservations(Set<Réservation> réservations) {
		this.réservations = réservations;
	}
	public void setHôtels(Set<Hôtel> hôtels) {
		this.hôtels = hôtels;
	}
}
