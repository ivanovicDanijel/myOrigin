package calculator;

public class Calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double squareRoot(double number, double root) {

		if (root == 0 || root == 1) {
			return 1;
		}

		else {

			return Math.pow(number, (1.0 / root));

		}
	}

	public double POW(double number, double pow) {

		return Math.pow(number, pow);
	}
}
