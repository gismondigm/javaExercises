/* Joe Gismondi
 * CS0422
 * Exercise 9.10
 * Quadratic Equation
 * 1/17/19
 */
package javaexercises.Exercises;
/**
 *
 * @author gismo
 */
/**		UML Diagram
	----------------------------------------------------------------------
	|		Class: Quadratic Equation		|
	----------------------------------------------------------------------
	|	a: double			|
	|	b: double
        * |     c: double
	----------------------------------------------------------------------
	|	QuadraticEquation()			|
	|	getA(): double				|
	|	getB(): double				|
        *       getC(): double
        *       getDiscriminant(): double
        *       getRootOne(): double
        *       getRootTwo(): double
	----------------------------------------------------------------------
*/
import java.util.Scanner;
public class Exercise9_10 
{
public static void RunExerciseNine_Ten()
    {
        System.out.println("Exercise 9.10");
        Exercise9_10();
    }
    public static void Exercise9_10() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = 0;
        double rootOne = 0;
        double rootTwo = 0;
        
        QuadraticEquation.DetermineDiscriminant(discriminant, rootOne, rootTwo);
    }
     
}
    class QuadraticEquation
    {
        private double a;
        private double b;
        private double c;   
    
    QuadraticEquation(double a, double b, double c)
    {
        
    }
        
    public double GetA()
    {
        return a;
    }
    public double GetB()
    {
        return b;
    }
    public double GetC()
    {
        return c;
    }
    public double GetDiscriminant()
    {
        double discriminant = Math.pow(b,2) - 4*a*c;
        return discriminant;
    }
    public double GetRoot1()
    {
        double rootOne = (-b + Math.pow(b*b -4*a*c, 0.5))/2*a;
        return rootOne;
    }
    public double GetRoot2()
    {
        double rootTwo = (-b - Math.pow(b*b -4*a*c, 0.5))/2*a;
        return rootTwo;
    }
    public static void DetermineDiscriminant(double discriminant, double rootOne, double rootTwo)
    {
        if (discriminant > 0)
        {
            System.out.println("The equation has two roots " + rootOne + " and " + rootTwo);
        }
        else if (discriminant == 0)
        {
            System.out.println("The equation has one root " + rootOne);          
        }
        else
            System.out.println("The equation has no roots");
    }
    }
