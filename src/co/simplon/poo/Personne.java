package co.simplon.poo;
/**
 * Définir une structure de données (data structure)
 * <p>
 * Composée de champ (données) er d'operations sur ces memes données
 * Définier un type abstrait de données (ADT abstract data type)
 * <p>
 * Type: la classe utilisée comme type grace à son nom unique 
 * <p>
 * Abstrait: définition static du type
 * Donnéees: etat possible de chacun des objets
 * <p>
 * (Son etat devient concret quand je l'instancie)
 */
public class Personne {
	//Données: etat de chasue objet construit à partir de la class
	String prenom;
	String nom;
	String titre;
	String getPrenom() {
		return prenom;
	}
	
	//initialise chaque object obtenu à partir de la class:
	Personne(String prenom, String nom){
		//(permet d'obtenir un objet à partir de cette class, elle return un object à partir de cette structure)
		//this = se refere à chacun des objets obtenus grace à cette classe
		this.prenom = prenom;
		this.nom = nom;
	}
	
	String getNomComplet() {
		return prenom + " " + nom;
	}
}
