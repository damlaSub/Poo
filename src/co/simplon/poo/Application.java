package co.simplon.poo;

import java.util.Arrays;
import java.util.List;

import co.simplon.poo.humains.Femme;
import co.simplon.poo.humains.Homme;
import co.simplon.poo.humains.Humain;
import co.simplon.poo.humains.Identite;
import co.simplon.poo.humains.Magazine;
import co.simplon.poo.humains.Situation;

public class Application {
	public static void main(String[] args) {
		
		
		List<Humain> humains = construitHumain();
		for(Humain humain: humains){
			humain.boitDesBieres();
			if(humain instanceof Homme) {
				//casting = voir comme et non une conversion
				//turu degistirmedi sadece belirtti
				Homme homme = (Homme) humain;
				homme.nettoieSaVoiture();
				
			}
		}

//		List<Homme> hommes = construitHommes();
//		for(Homme homme : hommes) {
//			System.out.println(homme.information());
//		}
//		List<Femme> femmes = construitFemmes();
//		
//		for(Femme femme : femmes) {
//			System.out.println(femme.information());
//		}
	}
//		Identite frank = new Identite("Frank", "MARSH");
//
//		Homme homme = new Homme(frank, Situation.MARIE);
//		
//		String prenom = homme.getIdentite().getFirstname();
//		String nom = homme.getIdentite().getLastname();
//		Situation situation = homme.getSituation();
//		System.out.println(homme.information());
		
		//Une classe generique
		//Type de polymorphisme (arrivé avec le java 5, comme les enums)
	
	private static List<Humain> construitHumain(){
		Identite id1 = new Identite("Frank", "MARSH");

		Homme h1 = new Homme(id1, Situation.MARIE);
		Identite id2 = new Identite("Robert", "DUPONT");

		Femme f1 = new Femme(id2, Situation.CELIBATAIRE);
		return List.of(h1,f1);
		
	}
	
	
	
	
	
	
	
		private static List<Homme> construitHomme(){
			Identite id1 = new Identite("Frank", "MARSH");

			Homme h1 = new Homme(id1, Situation.MARIE);
			Identite id2 = new Identite("Madelene", "BONNE-DAMLA");

			Homme h2 = new Homme(id2, Situation.DIVORCE);
			return List.of(h1,h2);
			
		}
		
		private static List<Femme> construitFemmes(){
			Identite id1 = new Identite("Madelene", "BONNE-DAMLA");

			Femme h1 = new Femme(id1, Situation.DIVORCE);
			Identite id2 = new Identite("Roberta", "UNKNOWN");

			Femme h2 = new Femme(id2, Situation.CELIBATAIRE);
			return List.of(h1, h2);
			
		}
		
		
		

		
		
		
		
		
//		Identite damla = new Identite("Damla", "SUB");
//		System.out.println(homme.getSituation().getLabel());
//		System.out.println(Situation.CELIBATAIRE.ordinal());
//		System.out.println(Situation.DIVORCE.ordinal());
//		System.out.println(Situation.MARIE.ordinal());
//		System.out.println(Arrays.toString(Situation.values()));
//		String situationName = "MARIE";//input
//		Situation actuelle = (Situation.valueOf(situationName));
//		Situation suivante = actuelle.prochaine();
//		System.out.println(actuelle);
//		System.out.println(suivante);
//		System.out.println(Situation.valueOf(situationName));
//		Identite identite = homme.getIdentite();
//		System.out.println(identite.getFirstname());
//		Magazine soFoot = new Magazine("So Foot");
//		Magazine closer = new Magazine("Closer");
//		homme.lit(soFoot);
//		homme.faitLaVaisselle();
//		homme.nettoieSaVoiture();
//		homme.boitDesBieres();
//		Femme femme = new Femme(damla);
//		femme.lit(closer);
//		femme.faitLaVaisselle();
//		femme.boitDesBieres();
		//Humain humain = new Humain(null); pas instantiable
	}





//Homme homme = new Homme("Frank", "MARSHALL");
		//homme.getNomComplet();


//Code client de la classe Personne
		//pour construire autant d'objects que necessaire
		//chacun avec son etat (données)
		//Je vois un type de données "Personne" 
		//Personne personne = new Personne("Frank", "MARSHALL");
		//personne.prenom = null;
	//	personne.titre = "Mr";