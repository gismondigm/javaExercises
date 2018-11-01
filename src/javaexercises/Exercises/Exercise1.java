package javaexercises.Exercises;

public class Exercise1 
{
    public static void RunExerciseOne()
    {  
       System.out.println("Starting Exercise 1");  
       double circlePerimeter, circleArea, circleRadius, rectangleArea, rectangleWidth, rectangleHeight, rectanglePerimeter;                   
       circleRadius = 5.5;
       rectangleWidth = 4.5;
       rectangleHeight = 7.9;
       circleArea = CalculateCircleArea(circleRadius);
       circlePerimeter = CalculateCirclePerimeter(circleRadius);
       rectangleArea = CalculateRectangleArea(rectangleWidth, rectangleHeight);
       rectanglePerimeter = CalculateRectanglePerimeter(rectangleWidth, rectangleHeight);
       
       System.out.println("____________________________");
       System.out.println("Programing exercise 1.1");
       System.out.println("Welcome to JAVA");
       System.out.println("Welcome to Computer Science");
       System.out.println("Programing is fun");
       System.out.println("____________________________");
       System.out.println("Programing exercise 1.3.1");
       System.out.println("   J    A    V     V   A   ");
       System.out.println("   J   A A    V   V   A A  ");
       System.out.println("J  J  AAAAA    V V   AAAAA ");
       System.out.println(" JJ  A     A    V   A     A");
       System.out.println("____________________________");
       System.out.println("Programing exercise 1.8");
       System.out.println("Parameter and area of a circle:");
       System.out.println("Circle Radius = " + circleRadius);
       System.out.println("Circle Area = " + circleArea);
       System.out.println("Circle Perimeter = " + circlePerimeter);
       System.out.println("____________________________");
       System.out.println("Programing exercise 1.9");
       System.out.println("Area and perimeter of a rectangle:");
       System.out.println("Rectangle Width = " + rectangleWidth);
       System.out.println("Rectangle Height = " + rectangleHeight);
       System.out.println("Rectangle Area = " + rectangleArea);
       System.out.println("Rectangle Perimeter = " + rectanglePerimeter);
       System.out.println("Ending Exercise 1");
    }
    public static double CalculateCircleArea(double radius)
    {
        double pi = 3.14159;
        return radius * radius * pi;
    }
    public static double CalculateCirclePerimeter(double radius)
    {
        double pi = 3.14159;
        return 2 * radius * pi;
    }
    public static double CalculateRectangleArea(double width, double height)
    {
        return width * height;
    }
    public static double CalculateRectanglePerimeter(double width, double height)
    {
        return (2 * width) + (2 * height);
    }
}
