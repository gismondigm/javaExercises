package javaexercises.Exercises;

import Models.Circle;
import Utilities.Helper;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise4 
{
    public static void RunExerciseFour()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 4");
        Exercise4_1();
        Exercise4_6();
        Exercise4_23();
        Exercise4_24();
        System.out.println("Ending Exercise 4");
        Helper.PrintLineBreak();
    }   
    private static void Exercise4_1()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 4.1");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the radius of a Pentagon");
        double radius=input.nextDouble();
        double side = Helper.CalculatePentagonSideFromRadius(radius);
        double areaOfPentagon = Helper.CalculatePentagonAreaFromSide(side);
        System.out.println("The area of a Pentagon is: " + Helper.Round(areaOfPentagon));
        Helper.PrintLineBreak();
    }
    private static void Exercise4_6()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 4.6 Random Points on a Circle");
        Circle circle = new Circle(40);
        System.out.println("The three random angles are: " + Helper.Round(circle.PolygonAngle1) + " " + Helper.Round(circle.PolygonAngle2) + " " + Helper.Round(circle.PolygonAngle3));
        Helper.PrintLineBreak();
    }
    private static void Exercise4_23()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 4.23 Payroll");
        System.out.println("Enter employee's name");
        Scanner input = new Scanner(System.in);
        String employeesNameFromInput = input.next();
        System.out.println("Enter number of hours worked in a week");
        int hoursWorkedInWeekFromInput = input.nextInt();    
        System.out.println("Enter hourly pay rate");
        double payRateHourlyFromInput = input.nextDouble();       
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxRateFromInput = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxRateFromInput = input.nextDouble();
        double grossPayCalculated = Helper.CalculateGrossPay(hoursWorkedInWeekFromInput, payRateHourlyFromInput);        
        System.out.println("Employee's name: " + employeesNameFromInput);
        System.out.println("Hours worked: " + hoursWorkedInWeekFromInput);
        System.out.println("Pay rate: $" + payRateHourlyFromInput);
        System.out.println("Gross pay: $" + grossPayCalculated);
        System.out.println("Deductions:");        
        double federalWithhold = Helper.CalculateFederalWithhold(grossPayCalculated, federalTaxRateFromInput);
        double stateWithhold = Helper.CalculateStateWithhold(grossPayCalculated, stateTaxRateFromInput);
        System.out.println("Federal Withholding: $" + federalWithhold);
        System.out.println("State Withholding: $" + Helper.RoundFloor(stateWithhold));
        double totalDeduction = Helper.CalculateDeduction(federalWithhold, stateWithhold);
        System.out.println("Total Deduction: $" + Helper.RoundFloor(totalDeduction));
        double netPay = Helper.CalculateNetPay(grossPayCalculated, totalDeduction);
        System.out.println("Net Pay: $" + Helper.RoundFloor(netPay));
        Helper.PrintLineBreak();
    }
    private static void Exercise4_24()
    {
        Helper.PrintLineBreak();
        System.out.println("Exercise 4.24 Order Cities");
        Scanner inputCity = new Scanner(System.in);
        System.out.println("Enter the first city:");
        String cityOne = inputCity.nextLine();
        System.out.println("Enter the second city:");
        String cityTwo = inputCity.nextLine();
        System.out.println("Enter the third city:");
        String cityThree = inputCity.nextLine();
        List<String> cities = Arrays.asList(cityOne, cityTwo, cityThree);
        Collections.sort(cities, String.CASE_INSENSITIVE_ORDER);        
        System.out.println("The three cities in alphabetical order are " + cities.get(0) + " " + cities.get(1) + " " + cities.get(2));        
        Helper.PrintLineBreak();
    }
}
