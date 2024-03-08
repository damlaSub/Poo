package co.simplon.poo.overloadingandstreams;

import java.util.Arrays;

public class CalApplication {

	public static void main(String[] args) {
	int[] values = {1,2,3, 4};
	//int[] evens = Calculator.evens(values);
	//int[] squares = Calculator.squares(values);
	int[] res = Calculator.evenSquares(values);
	System.out.println(Arrays.toString(res));
	}

}
