package javaexercises.Exercises;
import Utilities.EnumHandler.Months;
import Utilities.Helper;
import java.util.Scanner;

public class Exercise3 
{
    public static void RunExerciseThree()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 3");
        Exercise3_1();
        Exercise3_11();
        Exercise3_22();
        Exercise3_26();
        System.out.println("Ending Exercise 3");
        Helper.PrintLineBreak();
    }
    private static void Exercise3_1()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 3.1");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a, b, c: "); 
        double a=input.nextDouble();  
        double b=input.nextDouble(); 
        double c=input.nextDouble(); 
        double discriminant = Helper.CalculateDiscriminant(a,b,c);
        double rootOne = Helper.CalculateRootOne(a, b, c);
        double rootTwo = Helper.CalculateRootTwo(a, b, c);        
        DetermineDiscriminant(discriminant, rootOne, rootTwo);
        Helper.PrintLineBreak();
    }
    private static void Exercise3_11()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 3.11");
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter a month (1-12) and a year: ");
        int month=input.nextInt();  
        int year=input.nextInt();
        DetermineValidMonth(month);       
        boolean isLeapYear = DetermineLeapYear(year);
        int daysInMonth = DetermineDaysInMonth(month, isLeapYear);
        String monthName = DetermineMonthName(month);        
        System.out.println(monthName +" " + year + " has " + daysInMonth + " days");
        Helper.PrintLineBreak();
    }
    private static void Exercise3_22()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 3.22");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point: ");
        int circle=10;        
        double x1=0;
        double y1=0;
        double x2=input.nextDouble();
        double y2=input.nextDouble();    
        double distanceFromInput= Helper.CalculateDistanceFromInput(x1, x2, y1, y2);
        DetermineIsInCircle(distanceFromInput, x2, y2, circle);
        Helper.PrintLineBreak();
    }
    private static void Exercise3_26()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 3.26");
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter an integer: ");
        int numberFromInput = input.nextInt();
        DetermineIsDivisibleAnd(numberFromInput);
        DetermineIsDivisibleOr(numberFromInput);
        DetermineIsDivisibleNotBoth(numberFromInput);
        Helper.PrintLineBreak();
    }
    private static void DetermineIsDivisibleAnd(int number)
    {
        boolean isDivisible = false;
        if (number %5==0 && number%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + number + " Divisible by 5 and 6? " + isDivisible); 
        }
        else
        {
            System.out.println("Is " + number + " Divisible by 5 and 6?" + isDivisible);
        }
    }
    private static void DetermineIsDivisibleOr(int number)
    {
        boolean isDivisible = false;
        if (number%5==0 || number%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + number + " Divisible by 5 or 6? " + isDivisible); 
        }
        else
        {
            System.out.println("Is " + number + " Divisible by 5 or 6?" +isDivisible);
        }
    }
    private static void DetermineIsDivisibleNotBoth(int number)
    {
        boolean isDivisible = false;
        if (number%5==0 ^ number%6==0)
        {
            isDivisible = true;
        }
        if (isDivisible)
        {
            System.out.println("Is " + number + " Divisible by 5 or 6, but not both? " + isDivisible);
        }
        else
        {
            System.out.println("Is " + number + " Divisible by 5 or 6, but not both?" + isDivisible);
        }
    }
    private static void DetermineValidMonth(int month)
    {
        if (month < 1 || month > 12)
        {
            System.out.println("You entered " + month + ". Please restart and enter a valid month");
            System.exit(0);
        }
    }
    private static void DetermineDiscriminant(double discriminant, double rootOne, double rootTwo)
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
        {
            System.out.println("The equation has no real roots");    
        }
    }
    private static void DetermineIsInCircle(double distanceFromInput, double x2, double y2, int circle)
    {
        boolean isInCircle = false;
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
    }
    private static boolean DetermineLeapYear(int year)
    {
        boolean isLeapYear;
        if (year%4==0 && year%100 !=0)
        {
            isLeapYear = true;
        }
        else isLeapYear = year%400==0;
        return isLeapYear;
    }
    private static int DetermineDaysInMonth(int month, boolean isLeapYear)
    {
        int daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                if (isLeapYear)
                {
                    daysInMonth = 29;
                }
                else
                {
                    daysInMonth = 28;
                }   break;
            default:
                daysInMonth = 30;
                break;
        }
        return daysInMonth;
    }
    private static String DetermineMonthName(int month)
    {
        switch (month){
        case 1:
            return Months.January.Name;
        case 2:
            return Months.Feburary.Name;
        case 3:
            return Months.March.Name;
        case 4:
            return Months.April.Name;
        case 5:
            return Months.May.Name;
        case 6:
            return Months.June.Name;
        case 7:
            return Months.July.Name;
        case 8:
            return Months.August.Name;
        case 9:
            return Months.September.Name;
        case 10:
            return Months.October.Name;
        case 11:
            return Months.November.Name;
        case 12:
            return Months.December.Name;
        default:
            return "Invalid Number" + month;
        }
    }
    
}
