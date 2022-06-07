
public class Personnel extends Adulte{
	// Attributs
	private float salaire;
	private boolean estDirecteur;
	private Hôtel hôtel;
	
	// Constructeur
	public Personnel(Hôtel hôtel, float salaire, boolean estDirecteur)
	{
		this.salaire = salaire;
		this.estDirecteur = estDirecteur;
		this.hôtel = hôtel;
	}
	
	// Getters
	public float getSalaire() {
		return salaire;
	}
	public Hôtel getHôtel() {
		return hôtel;
	}
	public boolean isEstDirecteur() {
		return estDirecteur;
	}
	
	// Setters
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public void setEstDirecteur(boolean estDirecteur) {
		this.estDirecteur = estDirecteur;
	}
	public void setHôtel(Hôtel hôtel) {
		this.hôtel = hôtel;
	}
}
