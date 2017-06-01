package calculator;

public class Substraction extends Equation{

	private double firstNumber;
	private double secondNumber;
	
  public Substraction(double firstNum, double secondNum){
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}

	@Override
	public double calcualteEquation() {
	
		return firstNumber-secondNumber;
	}
	
	
	

}
