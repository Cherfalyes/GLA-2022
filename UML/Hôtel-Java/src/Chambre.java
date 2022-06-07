

public class Chambre {
	// Définition de l'énumération qui regroupe les types de SDB
	public enum SDB{douche, baignoire};
	
	// Définition des attributs
	private float prix;
	private int nbLits;
	private String numéro;
	private SDB sdb;
	private Hôtel hôtel;
	
	// Getters : permet de récupérer la valeur des attributs privés de la classe
	public float getPrix() {
		return prix;
	}
	public int getNbLits() {
		return nbLits;
	}
	public String getNuméro() {
		return numéro;
	}
	public SDB getSdb() {
		return sdb;
	}
	public Hôtel getHôtel() {
		return hôtel;
	}
	
	// Setters : permettent de changer la valeur des attributs privés
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public void setNbLits(int nbLits) {
		this.nbLits = nbLits;
	}
	public void setNuméro(String numéro) {
		this.numéro = numéro;
	}
	public void setSdb(SDB sdb) {
		this.sdb = sdb;
	}
	public void setHôtel(Hôtel hôtel) {
		this.hôtel = hôtel;
	}
	// Méthodes et Opérations
	public float chiffreAffaireQuotidien() {
		return (float) 0;
	}
	public float chiffreAffaireHebdomadaire() {
		return (float) 0;
	}

}
