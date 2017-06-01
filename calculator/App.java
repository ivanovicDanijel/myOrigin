package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		double a = 0;
		double b = 0;
		String sign = "";
		double result = 0;
		
		System.out.println("Welcome!\n");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("Please enter the first number");
		a = Double.parseDouble(reader.readLine());
		System.out.println("Please enter the sign of wanted operation :");
		System.out.println("Allowed signs are: +, -, *, /, ^ for pow, sqrt for square root");
		sign = reader.readLine();
		System.out.println("Please enter the second number");
		b = Double.parseDouble(reader.readLine());
		
	}catch(NumberFormatException e){
		System.out.println("That's not a number!");
		e.printStackTrace();
	}catch(IOException e){
		System.out.println("Problem with reading input");
		e.printStackTrace();
	}
	
	switch(sign){
	case "+":
		result = calc.add(a, b);
		System.out.println("Result: " + result);
		break;
	case "-":
		result = calc.substract(a, b);
		System.out.println("Result: " + result);
		break;
	case "*":
		result = calc.multiply(a, b);
		System.out.println("Result: " + result);
		break;
	case "/":
		result = calc.divide(a, b);
		System.out.println("Result: " + result);
		break;
	case "^":
		result = calc.POW(a, b);
		System.out.println("Result: " + result);
		break;
	case "sqrt":
		result = calc.squareRoot(a, b);
		System.out.println("Result: " + result);
		break;
		default:
			System.out.println("Wrong sign!");
	
	}
	}
}
