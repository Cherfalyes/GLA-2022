import java.util.Date;

public class Réservation {
	// Attributs
	private String numRéservation;
	private Date dateArrivé;
	private Date dateDépart;
	private float loyerPayé;
	private Chambre chambreReservée;
	private Personne personne;
	
	// Getters : 
	public Personne getPersonne() {
		return personne;
	}
	public String getNumRéservation() {
		return numRéservation;
	}
	public Date getDateArrivé() {
		return dateArrivé;
	}
	public Date getDateDépart() {
		return dateDépart;
	}
	public float getLoyerPayé() {
		return loyerPayé;
	}
	public Chambre getChambreReservée() {
		return chambreReservée;
	}

	// Setters : 
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public void setNumRéservation(String numRéservation) {
		this.numRéservation = numRéservation;
	}
	public void setDateArrivé(Date dateArrivé) {
		this.dateArrivé = dateArrivé;
	}
	public void setDateDépart(Date dateDépart) {
		this.dateDépart = dateDépart;
	}
	public void setLoyerPayé(float loyerPayé) {
		this.loyerPayé = loyerPayé;
	}
	public void setChambreReservée(Chambre chambreReservée) {
		this.chambreReservée = chambreReservée;
	}
	
	
	
	
	// Méthodes de la classe
	public void générerFacture() {
		// Code permettant de générer une facture
	}
}
