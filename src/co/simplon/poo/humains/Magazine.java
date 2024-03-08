package co.simplon.poo.humains;

//Classe concrete peut etre marquee final
//En interdire l'extention
public final class Magazine {

	//Document mieux le fait que l'objet soit immuable
	private final String titre;
	
	public Magazine(String titre) {
		this.titre = titre;
	}
	public String getTitre() {
		//final evire ce type d'accident
		//This.titre =null!
		return titre;
	}
}
