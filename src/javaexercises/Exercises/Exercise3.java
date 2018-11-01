package javaexercises.Exercises;

import java.util.Scanner;

public class Exercise3 
{
    public static void RunExerciseThree()
    {
        System.out.println("Starting Exercise 3");
     // 3.1  3.11  3.22  3.26 Exercises pg 109-114
        
        // Exercises 3.1
        System.out.println("Exercise 3.1");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a, b, c: "); 
        double a=input.nextDouble();  
        double b=input.nextDouble(); 
        double c=input.nextDouble(); 
        double discriminant = b*b - 4*a*c;
        double rootOne = (-b + Math.pow(b*b - 4*a*c, 0.5))/2*a;  
        double rootTwo = (-b - Math.pow(b*b - 4*a*c, 0.5))/2*a; 
        
        if (discriminant > 0)
        {
        System.out.println("The equation has two roots " + rootOne + " and " + rootTwo);    
        }
        else if (discriminant == 0)
        {
        System.out.println("The equation has one root " + rootOne);    
        }
        else           
        {
        System.out.println("The equation has no real roots");    
        }
        
        // Exercises 3.11
        System.out.println("Exercise 3.11");
        System.out.println("Enter a month (1-12) and a year: ");
        int month=input.nextInt();  
        int year=input.nextInt();
        if (month < 1 || month > 12)
        {
            System.out.println("You entered " + month + ". Please restart and enter a valid month");
            return;
        }
        int daysInMonth;
        boolean isLeapYear = false;
        String monthString="";
        if (year%4==0 && year%100 !=0)
        {
            isLeapYear = true;
        }
        else if (year%400==0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||month==12)
        {
            daysInMonth = 31;
        }
        else if (month==2)
        {
            if (isLeapYear)
            {
                daysInMonth = 29;
            }
            else 
            {
                daysInMonth = 28;
            }
        }
        else
        {
            daysInMonth = 30;
        }
        if (month==1)
        {
            monthString="January";
        }
        if (month==2)
        {
            monthString="February";
        }
        if (month==3)
        {
            monthString="March";
        }
        if (month==4)
        {
            monthString="April";
        }
        if (month==5)
        {
            monthString="May";
        }
        if (month==6)
        {
            monthString="June";
        }
        if (month==7)
        {
            monthString="July";
        }
        if (month==8)
        {
            monthString="August";
        }
        if (month==9)
        {
            monthString="September";
        }
        if (month==10)
        {
            monthString="October";
        }
        if (month==11)
        {
            monthString="November";
        }
        if (month==12)
        {
            monthString="December";
        }
        System.out.println(monthString +" " + year + " has " + daysInMonth + " days");
         
        // Exercise 3.22
        System.out.println("Exercise 3.22");
        System.out.println("Enter a point: ");
        boolean isInCircle = false;
        int circle=10;        
        double x1=0;
        double y1=0;
        double x2=input.nextDouble();
        double y2=input.nextDouble();    
        double distanceFromInput=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        if (distanceFromInput <= 10)
        {
            isInCircle = true;
        }
        if (isInCircle)
        {
            System.out.println("Point (" + x2 + "," + y2 + ") is in circle with radius " + circle);           
        }
        else
        {
           System.out.println("Point (" + x2 + "," + y2 + ") is NOT in circle with radius " + circle); 
        }
        // Exercise 3.26
        System.out.println("Exercise 3.26");
        System.out.println("Enter an integer: ");
        int num1=input.nextInt();
        boolean isDivisible = false;
        if (num1 %5==0 && num1%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + num1 + " Divisible by 5 and 6? " + isDivisible); 
        }
        else
        {
            System.out.println("Is " + num1 + " Divisible by 5 and 6? false");
        }
        if (num1%5==0 || num1%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + num1 + " Divisible by 5 or 6? " + isDivisible); 
        }
        else
        {
            System.out.println("Is " + num1 + " Divisible by 5 or 6? false");
        }
        
        if (num1%5==0 ^ num1%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + num1 + " Divisible by 5 or 6, but not both? " + isDivisible);
        }
        else
        {
            System.out.println("Is " + num1 + " Divisible by 5 or 6, but not both? false");
        }
        System.out.println("Ending Exercise 3");
    }   
    
}
