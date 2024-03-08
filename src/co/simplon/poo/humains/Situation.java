package co.simplon.poo.humains;

//enum = permet d'enumerer des obj d'un certain type (Situtation)
//destiner aux obj qui ont peu possibilité de chang. 
//definitif un type "obj" Situation
//un enum est un obj immuable , non instantiable en dehors de la classe
//documenter si l'ordre de declaration est important ou pas 
public enum Situation {

			CELIBATAIRE("Célibataire"),
			MARIE("Marié"),
			DIVORCE("Divorcé");
			
			private final String label;
			
			//static car tout le temps le meme
			private final static Situation[] ALL = values(); 
		
			private Situation(String label) {
				//
				this.label = label;
			}
			public String getLabel() {
				return label;
			}
			
			public Situation prochaine() {
				int courante = ordinal();
				int suivante = courante + 1;
				return ALL[suivante];
			}
}
