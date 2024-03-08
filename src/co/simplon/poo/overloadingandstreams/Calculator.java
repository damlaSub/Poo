package co.simplon.poo.overloadingandstreams;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public final class Calculator {

	private Calculator() {
		
	}
	//version historique:
//	static double sum(double[] values) {
//		//for in order to sum
//		return 0.0;
//	}
	//version actu:
	//Imperative approch
	//Write how to sum
	static int sum(int... values) {
		//3 points >> array 

		return Arrays.stream(values).sum();
	}
	
	static double sum(double...values) {
		return Arrays.stream(values).sum();
	}
	//je mets un constant
	private static final IntUnaryOperator TO_SQUARE = (value) -> value * value ;
	
	private static  IntPredicate filterEven() {
		return (value) -> value % 2 == 0;
	}
	
//	static int[] evens(int... values) {
//		return Arrays.stream(filterEven() ).toArray();
//	}
 int[] squares(int ... values) {
		return Arrays.stream(values).map(TO_SQUARE).toArray();
	}
	
	static int[] evenSquares(int... values) {
		return Arrays.stream(values).filter(filterEven()).map(TO_SQUARE).toArray();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static double sum(double defaultValue, double ... values) {
//	if(values == null || values.length != 2) {
//		return defaultValue;
//	}
//	return 0.0;
//}
	
	
	//interdit:	
//	static double sum(double... values, int ... values2) {
//		//3 points >> array 
//		return 0.0;
//	}
	
	//args var ne peut pas etre le premier: 
	
//	static double sum(double... values, int ... defaultValue) {
//	//3 points >> array 
//	return 0.0;
//}
	
	
	
	
	
	
	
	
	//Signature d'une methode est son nom et ses args (ou pas)
	//Ainsi que le type de ses args (0 à n)
	//Ainsi que l'ordre des args
//	static double sum() {
//		return 0.0;
//	}
//	static double sum(double a) {
//		return a;
//	}
//	static int sum(int a) {
//		return a;
//	}
//	static double sum(double a, double b) {
//		return a + b;
//	}
//	static double sum(int a, double b) {
//		return a + b;
//	}
//	static double sum(double a, int b) {
//		return a + b;
//	}
}
