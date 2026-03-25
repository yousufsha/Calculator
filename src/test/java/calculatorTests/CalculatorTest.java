package calculatorTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.CalculatorMethods;

public class CalculatorTest {

	public static CalculatorMethods cal = new CalculatorMethods();
	
	@Test
	public void add() {
		Assert.assertEquals(cal.addition(10, 5), 15.0);
	}
	
	@Test
	public void sub() {
		Assert.assertEquals(cal.substraction(10,8), 2.0);
	}
	
	@Test
	public void multiply() {
		Assert.assertEquals(cal.multiplication(4, 5), 20.0);
	}
	
	@Test
	public void divide() {
		Assert.assertEquals(cal.division(10, 2), 5.0);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        cal.division(5, 0);
    }
	
	@Test
	public void square() {
		Assert.assertEquals(cal.square(16), 256.0);
	}
	
	@Test
	public void squareRoot() {
		Assert.assertEquals(cal.squareRoot(16), 4.0);
	}
}
