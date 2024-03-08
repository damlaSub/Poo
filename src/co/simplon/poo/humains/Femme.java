package co.simplon.poo.humains;

public class Femme extends Humain{

	
	public Femme(Identite identite) {
		this(identite, null);
		// TODO Auto-generated constructor stub
	}
	public Femme(Identite identite, Situation situation) {
		super(identite, situation);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void faitLaVaisselle() {
		//mauvaise implementation du comportement 
		//Sys.out("Passe l'aspirateur");
		System.out.println("Fait bien la vaisselle");
		
	}


	@Override
	public void boitDesBieres() {
		System.out.println("Boit beaucoup de bieres");
		
	}
}
