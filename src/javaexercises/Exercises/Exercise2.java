package javaexercises.Exercises;

import java.util.Scanner; 

public class Exercise2 
{
    public static void RunExerciseTwo()
    {
        System.out.println("Starting Exercise 2");
        // Convert Fahrenheit to Celsius
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a degree in Celsius: "); 
        double celsius=input.nextDouble(); 
        double fahrenheit = (9.0/5) * celsius + 32; 
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit"); 

        // Convert Inches to centimeters
        System.out.println("Enter a value for inches: ");
        double inches=input.nextDouble();
        double centimeter= 2.54 * inches;
        System.out.println(inches + " Inches is " + centimeter + " Centimeters");
        System.out.println("Ending Exercise 2");
    }
            
}
