package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testAddition() {
		Calc calculator = new Calc();
		double result = calculator.addition(2, 4);
		assertEquals(6, result);
	}

	@Test
	void testSubtraction() {
		Calc calculator = new Calc();
		double result = calculator.subtraction(2, 4);
		assertEquals(-2, result);
	}

	@Test
	void testMultiplication() {
		Calc calculator = new Calc();
		double result = calculator.multiplication(2, 4);
		assertEquals(8, result);
	}

	@Test
	void testDivision() {
		Calc calculator = new Calc();
		double result = calculator.division(2, 4);
		assertEquals(0.5, result);
	}
	
	@Test
	void testDivisionByZero() {
		Calc calculator = new Calc();
		double result = calculator.division(2, 0);
		assertEquals(Double.NaN, result);
	}

	@Test
	void testPower() {
		Calc calculator = new Calc();
		double result = calculator.power(2, 4);
		assertEquals(16, result);
	}

	@Test
	void fractions()
	{
		Calc calculator = new Calc();
		double temp = (double) 1/5 + (double) 3/15;
		double result = calculator.add_two_fractions(1, 5, 3, 15);
		assertEquals(temp, result);
	}
	
	@Test
	void quad_2_roots()
	{
		Calc calculator = new Calc();
		double a = 1;
		double b = -5;
		double c = 6;
		double determinant = b * b - 4 * a * c;
		
		double result = calculator.quadratic_equation(a, b, c);
		double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	    double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
	
	    System.out.println("\na = " + a + " b = " + b + " c = " + c);
	    System.out.println("2 roots : ");
	    System.out.format("root1 = %.2f and root2 = %.2f\n", root1, root2);
		assertEquals(2, result);
	}
	
	@Test
	void quad_1_root()
	{
		Calc calculator = new Calc();
		double a = 4;
		double b = -12;
		double c = 9;
		//double determinant = b * b - 4 * a * c;
		double root1;
		double root2;
		double result = calculator.quadratic_equation(a, b, c);
		System.out.println("\na = " + a + " b = " + b + " c = " + c);
	    root1 = root2 = -b / (2 * a);
	    System.out.format("1 root : \nroot1 = root2 = %.2f\n", root1);
		assertEquals(1, result);
	}
	
	@Test
	void quad_2_roots_with_imaginary()
	{
		Calc calculator = new Calc();
		double a = 2.3;
		double b = 4;
		double c = 5.6;
		double determinant = b * b - 4 * a * c;
		
	    // roots are complex number and distinct
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        
        System.out.println("\na = " + a + " b = " + b + " c = " + c);
        System.out.println("2 roots with imaginary part : ");
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi\n", real, imaginary);
		double result = calculator.quadratic_equation(a, b, c);
		assertEquals(0, result);
	}
	
	@Test
	void res()
	{
		Calc calculator = new Calc();
		calculator.results();
	}
	
}
