package co.simplon.poo.humains;

public class Identite {

	private String firstname;
	private String lastname;
	public Identite(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	//pas de marqueur d'accessibilité
		//un par default (default accessibility/visibility) visible uniquement dans le meme package que la classe
		String getNomComplet() {
			return firstname + " " + lastname;
		}
		
		public String getFirstname() {
			return firstname;
		}
		
		public String getLastname() {
			return lastname;
		}
		//ne jamais modifier l'etat interne de l'objet
		//Lecture seule dans toString
		@Override
		public String toString() {
			return "Identite [firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		
		/*
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}*/
}
