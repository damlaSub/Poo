package co.simplon.poo.humains;

//factoriser /mise en commun de comportement
//c'est une generalisation
//introduit un super type humain


// ? pertinent ou pas pouvoir instancier Humain
//Classe abst pas instantiable
public abstract class Humain { //Definition incomplete 
	//abstract = doit etre etendue pour la completer
	
	//Approche = composition (pas heritage)
	//Un humain est composé d'une identite
	//Un humain HAS_A identite
	//ajouté final car identité ne plus changer. Si ca change plus, on a plus besoin de setter
	private final Identite identite;
	
	private Situation situation;
	
	public Humain(Identite identite, Situation situation){
		if(identite == null) {
			throw new IllegalArgumentException();
		}
		this.identite = identite;
		this.situation = situation;
	}
	public final Identite getIdentite() {
		return identite;
	}
	
	public final Situation getSituation() {
		return situation;
	}
	//comportement par default qu l'on peut redefinier 
	public void faitLaVaisselle() {
		//mauvaise implementation du comportement 
		//Sys.out("Passe l'aspirateur");
		System.out.println("Fait la vaisselle");
		
	}
	//Humain utilise MAgazine au travers de la methode lit
	//mag n'est pas stockée
	public final void lit(Magazine mag) {
		//
		System.out.println("Lit " + mag.getTitre());
	}
	
	//Abstract sans corps, doit etre implementee dans la premiere classe concrete
	public abstract void boitDesBieres();
	
	public final boolean hasSituation() {
		return situation != null;
	}
	
	//pas getter > pas return un simple valeur > il y a des operations
	//Methode de requete
	//Query methods
	public final String information() {
		String prenom = identite.getFirstname();
		String nom = identite.getLastname();
		String label= "";
		if(hasSituation()) {
			label = situation.getLabel();
		}
		return prenom + " " + nom +" "+ label;
	}
	
}
