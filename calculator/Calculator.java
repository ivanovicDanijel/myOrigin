package calculator;

public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}

	public static double substract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

	public static double squareRoot(double number, double root) {

		if (root == 0 || root == 1) {
			return 1;
		}

		else {

			return Math.pow(number, (1.0 / root));

		}
	}

	public static double POW(double number, double pow) {

		return Math.pow(number, pow);
	}
}
