package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Welcome to simple calcualtor");
		
		while (true) {

			double firstNumber = getFirstNumber();
			String operator = getOperator();
			double secondNumber = getSecondNumber();
			double result = getResult(operator, firstNumber, secondNumber);
			System.out.println("Result is " + result);
			break;

		}

	}

	private static double getFirstNumber() {
		double firstNumber = 0;
		while (true) {
			try {
				System.out.println("Enter first number");
				firstNumber = inputNumber();

				break;
			}

			catch (InputMismatchException e) {
				System.out.println("Wrong input");
			} catch (NumberFormatException ex) {
				System.out.println("Wrong input");
			}
		}
		return firstNumber;

	}

	private static String getOperator() {
		String operator = "";

		while (!validOperator(operator)) {
			System.out.println("Enter assignment operator (+,-,*,/,sqrt,pow)");
			operator = userInput.nextLine();
		}

		return operator;

	}

	private static boolean validOperator(String operator) {
		operator = operator.toLowerCase();
		switch (operator) {

		case "+":
			return true;

		case "-":

			return true;
		case "*":

			return true;
		case "/":

			return true;

		case "sqrt":
			return true;

		case "pow":
			return true;

		default:
			return false;

		}

	}

	private static double getSecondNumber() {
		double secondNumber = 0;
		while (true) {
			try {
				System.out.println("Enter second number");
				secondNumber = inputNumber();
				break;
			}

			catch (InputMismatchException e) {
				System.out.println("Wrong input");
			} catch (NumberFormatException ex) {
				System.out.println("Wrong input");
			}
		}

		return secondNumber;
	}

	private static double inputNumber() {

		double number = Double.parseDouble(userInput.nextLine());
		return number;

	}

	private static double getResult(String operator, double firstNumber, double secondNumber) {
		Equation eq;
		switch (operator) {

		case "+":
			eq = new Sum(firstNumber, secondNumber);
			return eq.calcualteEquation();

		case "-":

			eq = new Substraction(firstNumber, secondNumber);
			return eq.calcualteEquation();
		case "*":

			eq = new Multiplying(firstNumber, secondNumber);
			return eq.calcualteEquation();
		case "/":

			eq = new Division(firstNumber, secondNumber);
			return eq.calcualteEquation();

		case "sqrt":
			eq = new NthRoot(firstNumber, secondNumber);
			return eq.calcualteEquation();

		case "pow":
			eq = new NthPower(firstNumber, secondNumber);
			return eq.calcualteEquation();

		default:
			return 0;
		}
	}

}
