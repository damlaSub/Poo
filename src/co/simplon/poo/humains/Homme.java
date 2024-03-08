//package fait partie du nom de la classe (son type)
//Defini un espace de nom
package co.simplon.poo.humains;

//public = marqueur d'accessibilité(visibilité)
//margueur vient dire ce qui est accessible depuis "ou"
//public = depuis n'importe ou
//private = depuis la classe elle meme uniquement 
//methodes definissent le comportement des futurs
//obtenus definit par la classe
public class Homme extends Humain {

	//une classe n'herite pas le constructor de parents
	public Homme(Identite identite) {
		//pour ne pas declarer une autre constructor dans le parent on utilise le constructor de cette classe
		this(identite, null); //null parce qu'on peut avoir identite = null
		// TODO Auto-generated constructor stub
	}
	
	//Constructor peut etre surcharger (overloading) 
	//Signature : nom (constructor pu methode ) + ses arguments 
	// arguments: nombre, type et ordre
	//Type de polymorphisme : 
	public Homme(Identite identite, Situation situation) {
		super(identite, situation);
		// TODO Auto-generated constructor stub
	}
	
	//Comportement specifique 
	public void nettoieSaVoiture() {
		System.out.println("Nettoie sa voiture");
	}

	@Override
	public void faitLaVaisselle() {
		//super.faitLaVaisselle();
		System.out.println("Fait mal la vaisselle");
	}
	@Override
	public void boitDesBieres() {
		System.out.println("Boit de bieres legeres");
		
	}
	
	
	
	
	
	
}
