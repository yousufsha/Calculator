package calculator;

public class CalculatorMethods {
	
	public double addition(double a, double b) {
		return a+b;
	}
	
	public double substraction(double a, double b) {
		return a-b;
	}
	
	public double multiplication(double a, double b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		if(b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a/b;
	}
	
	public double square(double a) {
		return a*a;
	}
	
	public double squareRoot(int a) {
		return Math.sqrt(a);
	}
	
	
	 public static void main(String[] arg) {
		
	    CalculatorMethods cal = new CalculatorMethods();
//		System.out.println(cal.addition(7, 7));
//		System.out.println(cal.substraction(458749,856.4));
//		System.out.println(cal.multiplication(4, 6));
//		System.out.println(cal.division(685469750, 2));
//		System.out.println(cal.division(4, 0));
//		System.out.println(cal.squareRoot(20));
	 }
}
