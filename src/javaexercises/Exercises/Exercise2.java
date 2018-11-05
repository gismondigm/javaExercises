package javaexercises.Exercises;

import Utilities.Helper;
import java.util.Scanner; 

public class Exercise2 
{
    public static void RunExerciseTwo()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 2");
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a degree in Celsius: "); 
        double celsius=input.nextDouble(); 
        double fahrenheit = Helper.CalculateFahrenheitFromCelsius(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit"); 
        Helper.PrintLineBreak();
        System.out.println("Enter a value for inches: ");
        double inches=input.nextDouble();
        double centimeter = Helper.CalculateInchesFromCentimeter(inches);
        System.out.println(inches + " Inches is " + centimeter + " Centimeters");
        System.out.println("Ending Exercise 2");
        Helper.PrintLineBreak();
    }            
}
