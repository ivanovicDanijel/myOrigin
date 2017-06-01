package calculator;

public class Sum extends Equation {
	private double firstNumber;
	private double secondNumber;

	Sum(double firstNum, double secondNum){
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}
	
	@Override
	public double calcualteEquation() {
		
		return firstNumber+secondNumber;
		
	}

}
