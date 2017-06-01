package calculator;

public class NthPower extends Equation {
	
	private double firstNumber;
	private double secondNumber;
	
	public NthPower(double firstNum,double secondNum) {
		// TODO Auto-generated constructor stub
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}

	@Override
	public double calcualteEquation() {
	return Math.pow(firstNumber, secondNumber);
	}
	
	
	


}
