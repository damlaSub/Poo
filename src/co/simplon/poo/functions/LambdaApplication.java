package co.simplon.poo.functions;

public class LambdaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tradi burger: 
		Eater eater = new EaterImpl();
		
		eater.eat("burger");
		eater.eat("pasta");
		
		//Functional burger:
		String type = "burger";
		functional((str) -> System.out.println("" + type) );
	}
	private static void functional(Eater eater) {
		eater.eat(null);
	}

}
