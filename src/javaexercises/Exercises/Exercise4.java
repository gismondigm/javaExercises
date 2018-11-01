package javaexercises.Exercises;

import java.util.Scanner;

public class Exercise4 
{
    public static void RunExerciseFour()
    {
    // 4.1 4.6 4.23 4.24 pg 152
        // Exercise 4.1 Area of a Pentagon
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the radius of a Pentagon");
        double radius=input.nextDouble();
        double s = 2*radius*Math.sin(Math.PI/5);
        double areaOfPentagon = (5 * Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
        System.out.println("The area of a Pentagon is: " + Math.round(areaOfPentagon*100)/100.0);
        
        // Exercise 4.6 Random Points on a Circle
        int circleRadius = 40;
        double firstRandomAngle = (Math.random()* (2*Math.PI));
        double secondRandomAngle = (Math.random()* (2*Math.PI));
        double thirdRandomAngle = (Math.random()* (2*Math.PI));
        
        double firstPointX = circleRadius * Math.cos(firstRandomAngle);
        double secondPointX = circleRadius * Math.cos(secondRandomAngle);
        double thirdPointX = circleRadius * Math.cos(thirdRandomAngle);
        
        double firstPointY = circleRadius * Math.sin(firstRandomAngle);       
        double secondPointY = circleRadius * Math.sin(secondRandomAngle);       
        double thirdPointY = circleRadius * Math.sin(thirdRandomAngle);
        
        double firstSideOfPolygon = Math.sqrt(Math.pow(secondPointX - thirdPointX, 2)+ Math.pow(secondPointY - thirdPointY, 2));
        double secondSideOfPolygon = Math.sqrt(Math.pow(firstPointX - thirdPointX, 2)+ Math.pow(firstPointY - thirdPointY, 2));
        double thirdSideOfPolygon = Math.sqrt(Math.pow(firstPointX - secondPointX, 2)+ Math.pow(firstPointY - secondPointY, 2));
        
        double firstSideSquared = firstSideOfPolygon * firstSideOfPolygon;
        double secondSideSquared = secondSideOfPolygon * secondSideOfPolygon;
        double thirdSideSquared = thirdSideOfPolygon * thirdSideOfPolygon;
        
        double firstTopEquation = firstSideSquared - secondSideSquared - thirdSideSquared;
        double secondTopEquation = secondSideSquared - firstSideSquared - thirdSideSquared;
        double thirdTopEquation = thirdSideSquared - secondSideSquared - firstSideSquared;
        
        double firstBottomEquation = -2 * secondSideOfPolygon * thirdSideOfPolygon;
        double secondBottomEquation = -2 * firstSideOfPolygon * thirdSideOfPolygon;
        double thirdBottomEquation = -2 * firstSideOfPolygon * secondSideOfPolygon;
        
        double firstAngleOfPolygon = Math.toDegrees(Math.acos((firstTopEquation) / (firstBottomEquation)));
        double secondAngleOfPolygon = Math.toDegrees(Math.acos((secondTopEquation) / (secondBottomEquation)));
        double thirdAngleOfPolygon = Math.toDegrees(Math.acos((thirdTopEquation) / (thirdBottomEquation)));
        
        System.out.println("The three random angles are: " + Math.round(firstAngleOfPolygon*100)/100.0 + " " + Math.round(secondAngleOfPolygon*100)/100.0 + " " + Math.round(thirdAngleOfPolygon*100)/100.0);
        
        // Exercise 4.23 Payroll      
        System.out.println("Enter employee's name");
        String employeesNameFromInput = input.next();
        System.out.println("Enter number of hours worked in a week");
        int hoursWorkedInWeekFromInput = input.nextInt();    
        System.out.println("Enter hourly pay rate");
        double payRateHourlyFromInput = input.nextDouble();       
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxRateFromInput = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxRateFromInput = input.nextDouble();
        double grossPayCalculated = hoursWorkedInWeekFromInput * payRateHourlyFromInput; 
        
        System.out.println("Employee's name: " + employeesNameFromInput);
        System.out.println("Hours worked: " + hoursWorkedInWeekFromInput);
        System.out.println("Pay rate: $" + payRateHourlyFromInput);
        System.out.println("Gross pay: $" + grossPayCalculated);
        System.out.println("Deductions:");
        
        double federalWithhold = grossPayCalculated * federalTaxRateFromInput;
        double stateWithhold = grossPayCalculated * stateTaxRateFromInput;
        
        System.out.println("Federal Withholding: $" + federalWithhold);
        System.out.println("State Withholding: $" + Math.floor(stateWithhold*100)/100.0);
        double totalDeduction= federalWithhold + stateWithhold;
        System.out.println("Total Deduction: $" + Math.floor(totalDeduction*100)/100.0);
        double netPay= grossPayCalculated - totalDeduction;
        System.out.println("Net Pay: $" + Math.floor(netPay*100)/100.0);
        
        // Exercise 4.24 Order Cities   
        Scanner inputCity = new Scanner(System.in);
        System.out.println("Enter the first city:");
        String cityOne = inputCity.nextLine();
        System.out.println("Enter the second city:");
        String cityTwo = inputCity.nextLine();
        System.out.println("Enter the third city:");
        String cityThree = inputCity.nextLine();
        
        String temp;
	if (cityOne.compareTo(cityTwo) > 0) 
        {
        temp = cityTwo;
        cityTwo = cityOne;
        cityOne = temp;
        }
        if (cityTwo.compareTo(cityThree) > 0) 
        {
        temp = cityThree;
        cityThree = cityTwo;
        cityTwo = temp;
        }
        if (cityOne.compareTo(cityTwo) > 0) 
        {
        temp = cityTwo;
        cityTwo = cityOne;
        cityOne = temp;
        }
        System.out.println("The three cities in alphabetical order are "   + cityOne + " " + cityTwo + " " + cityThree);
        }

}
