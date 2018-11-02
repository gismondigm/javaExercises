package javaexercises.Exercises;

import Utilities.Helper;

public class Exercise1 
{
    public static void RunExerciseOne()
    {  
       Helper.PrintLineBreak();
       System.out.println("Starting Exercise 1");  
       Exercise1_1();
       Exercise1_3_1();
       Exercise1_8();
       Exercise1_9();
       System.out.println("Ending Exercise 1");
       Helper.PrintLineBreak();
    } 
    private static void Exercise1_1()
    {
       Helper.PrintLineBreak();
       System.out.println("Programing exercise 1.1");
       System.out.println("Welcome to JAVA");
       System.out.println("Welcome to Computer Science");
       System.out.println("Programing is fun");
       Helper.PrintLineBreak();
    }
    private static void Exercise1_3_1()
    {
       Helper.PrintLineBreak();
       System.out.println("Programing exercise 1.3.1");
       System.out.println("   J    A    V     V   A   ");
       System.out.println("   J   A A    V   V   A A  ");
       System.out.println("J  J  AAAAA    V V   AAAAA ");
       System.out.println(" JJ  A     A    V   A     A");
       Helper.PrintLineBreak();
    }
    private static void Exercise1_8()
    {
       Helper.PrintLineBreak();
       System.out.println("Programing exercise 1.8");       
       double circlePerimeter, circleArea, circleRadius;                   
       circleRadius = 5.5;
       circleArea = Helper.CalculateCircleArea(circleRadius);
       circlePerimeter = Helper.CalculateCirclePerimeter(circleRadius);
       System.out.println("Parameter and area of a circle:");
       System.out.println("Circle Radius = " + circleRadius);
       System.out.println("Circle Area = " + circleArea);
       System.out.println("Circle Perimeter = " + circlePerimeter);
       Helper.PrintLineBreak();
    }
    private static void Exercise1_9()
    {
       Helper.PrintLineBreak();
       
       System.out.println("Programing exercise 1.9");
       double rectangleArea, rectangleWidth, rectangleHeight, rectanglePerimeter;
       rectangleWidth = 4.5;
       rectangleHeight = 7.9;
       rectangleArea = Helper.CalculateRectangleArea(rectangleWidth, rectangleHeight);
       rectanglePerimeter = Helper.CalculateRectanglePerimeter(rectangleWidth, rectangleHeight);       
       System.out.println("Area and perimeter of a rectangle:");
       System.out.println("Rectangle Width = " + rectangleWidth);
       System.out.println("Rectangle Height = " + rectangleHeight);
       System.out.println("Rectangle Area = " + rectangleArea);
       System.out.println("Rectangle Perimeter = " + rectanglePerimeter);       
       Helper.PrintLineBreak();
    }
}
