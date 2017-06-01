package calculator;

public class NthRoot extends Equation {

	private double firstNumber;
	private double secondNumber;
	
	public NthRoot(double firstNum,double secondNum) {
		// TODO Auto-generated constructor stub
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}

	@Override
	public double calcualteEquation() {
		return Math.pow(firstNumber, (1.0 / secondNumber));
	}

}
