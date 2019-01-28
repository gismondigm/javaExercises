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
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant: " + quadraticEquation.discriminant);
        System.out.println("GetDiscriminant: " + quadraticEquation.getDiscriminant());
        System.out.println("Root1: " + quadraticEquation.root1);
        System.out.println("GetRoot1: " + quadraticEquation.getRoot1());
        System.out.println("Root2: " + quadraticEquation.root2);
        System.out.println("GetRoot2: " + quadraticEquation.getRoot2());
        DetermineDiscriminant(quadraticEquation.getDiscriminant(), quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        DetermineDiscriminant(quadraticEquation.discriminant, quadraticEquation.root1, quadraticEquation.root2);
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
    class QuadraticEquation
    {
        private double a;
        private double b;
        private double c;   
        public double discriminant;
        public double root1;
        public double root2;
    QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = getDiscriminant();
        this.root1 = getRoot1();
        this.root2 = getRoot2();
    }
        
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
    public double getDiscriminant()
    {
        return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1()
    {
        double rootOne = (-b + Math.pow(b*b -4*a*c, 0.5))/2*a;
        return rootOne;
    }
    public double getRoot2()
    {
        double rootTwo = (-b - Math.pow(b*b -4*a*c, 0.5))/2*a;
        return rootTwo;
    }    
 }
