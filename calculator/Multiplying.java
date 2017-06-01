package calculator;

public class Multiplying extends Equation{

	private double firstNumber;
	private double secondNumber;
	
	public Multiplying(double firstNum, double secondNum){
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}

	@Override
	public double calcualteEquation() {
		
		return firstNumber*secondNumber;
	}
	
	
	

}
