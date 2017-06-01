package calculator;

public class Division  extends Equation {
	private double firstNumber;
	private double secondNumber;
	
	public Division(double firstNum, double secondNum){
		// TODO Auto-generated constructor stub
		this.firstNumber=firstNum;
		this.secondNumber=secondNum;
	}

	@Override
	public double calcualteEquation() {
		if(secondNumber==0){
			return 0;
		}
		return firstNumber/secondNumber;
	}
	
	
	

}
