/**
*
* @author Giannis
**/
package calculator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test; 

class Calc 
{
	
    private double solution; 
    static double x = 2;
    static double y = 4;
    // value a, b, and c
    double a = 2.3, b = 4, c = 5.6;
    double root1, root2;

    
    
    public static double addition(double x, double y) 
    { 
       return x + y; 
    } 
    public double subtraction(double x, double y) 
    { 
       return x - y; 
    } 
    public double multiplication(double x, double y) 
    {    
       return x * y; 
    } 
    public double division(double x, double y) 
    {  
       if (y == 0)
    	   return Double.NaN;
       solution = x / y;
       return solution; 
    } 
    public double power(double base, double exponent)
    {
        solution = Math.pow(base, exponent);
        return solution;
    }

    int quadratic_equation(double a, double b, double c)
    {
    	// calculate the determinant (b2 - 4ac)
    	double determinant = b * b - 4 * a * c;
	    // check if determinant is greater than 0
	    if (determinant > 0) 
	    {
	      return 2;
	    }
	
	    // check if determinant is equal to 0
	    else if (determinant == 0) {
	      return 1;
	    }
	
	    // if determinant is less than zero
	    else {
	      return 0 ;
	    }
    }
    
    int gcd(int a, int b)
    {
    		if (a == 0)
    			return b;
    		return gcd(b%a, a);
    }

    double lowest(int den3, int num3)
	{
		// Finding gcd of both terms
		int common_factor = gcd(num3,den3);

		// Converting both terms into simpler
		// terms by dividing them by common factor
		den3 = den3/common_factor;
		num3 = num3/common_factor;
		System.out.println(num3 + "/" + den3);
		return (double) num3 / den3;
	}
    
   double addFraction(int num1, int den1, int num2, int den2)
    {
		// Finding gcd of den1 and den2
		int den3 = gcd(den1,den2);
		
		den3 = (den1*den2) / den3;
		
		// Changing the fractions to have same denominator
		// Numerator of the final fraction obtained
		int num3 = (num1)*(den3/den1) + (num2)*(den3/den2);
		
		// Calling function to convert final fraction
		// into it's simplest form
		return lowest(den3,num3);
    }
    
    public double add_two_fractions(int num1, int den1, int num2, int den2)
    {
		System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
		//System.out.println(addFraction(num1, den1, num2, den2));
		return addFraction(num1, den1, num2, den2);
    }
    
    void results()
    {
    	System.out.println(x + " + " + y + " = " + addition(2, 4));
    	System.out.println(x + " - " + y + " = " + subtraction(2, 4));
    	System.out.println(x + " * " + y + " = " + multiplication(2, 4));
    	System.out.println(x + " / " + y + " = " + (double) division(2, 4));
    	System.out.println(x + " ^ " + y + " = " + Math.pow(2, 4));
    }
}
