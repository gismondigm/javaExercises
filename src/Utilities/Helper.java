package Utilities;

public class Helper 
{
    public static void PrintLineBreak()
    {
        System.out.println("____________________________");
    }
    public static double CalculateCircleArea(double radius)
    {
        return radius * radius * Math.PI;
    }
    public static double CalculateCirclePerimeter(double radius)
    {
        return 2 * radius * Math.PI;
    }
    public static double CalculateRectangleArea(double width, double height)
    {
        return width * height;
    }
    public static double CalculateRectanglePerimeter(double width, double height)
    {
        return (2 * width) + (2 * height);
    }  
    public static double CalculateFahrenheitFromCelsius(double celsius)
    {
        return (9.0/5) * celsius + 32; 
    } 
    public static double CalculateInchesFromCentimeter(double inches)
    {
        return 2.54 * inches;
    } 
    public static double CalculateDiscriminant(double a, double b, double c)
    {
        return b*b - 4*a*c;
    }
    public static double CalculateRootOne(double a, double b, double c)
    {
        return (-b + Math.pow(b*b - 4*a*c, 0.5))/2*a;
    }
    public static double CalculateRootTwo(double a, double b, double c)
    {
        return (-b - Math.pow(b*b - 4*a*c, 0.5))/2*a; 
    }
    public static double CalculateDistanceFromInput(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }
    public static double CalculatePentagonSideFromRadius(double radius)
    {
        return 2*radius*Math.sin(Math.PI/5);
    }
    public static double CalculatePentagonAreaFromSide(double side)
    {
        return (5 * Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
    }
    public static double Round(double input)
    {
        return (Math.round(input*100)/100.0);
    }
    public static double RoundFloor(double input)
    {
        return (Math.floor(input*100)/100.0);
    }
    public static double CalculateRandomAngle()
    {
        return (Math.random()* (2*Math.PI));
    }
    public static double CalculateRandomPointOnCircleFromRadiusX(double circleRadius, double randomAngle)
    {
        return circleRadius * Math.cos(randomAngle);
    }
    public static double CalculateRandomPointOnCircleFromRadiusY(double circleRadius, double randomAngle)
    {
        return circleRadius * Math.sin(randomAngle);
    }
    public static double CalculateSideOfPolygonFromPoints(double xLeft, double xRight, double yLeft, double yRight)
    {
        return Math.sqrt(Math.pow(xLeft - xRight, 2)+ Math.pow(yLeft - yRight, 2));
    }
    public static double CalculateAngleOfPolygon(double sTopLeft, double sTopMiddle, double sTopRight, double sBottomLeft, double sBottomRight)
    {
        double firstTopEquation = sTopLeft - sTopMiddle - sTopRight;        
        double firstBottomEquation = -2 * sBottomLeft * sBottomRight;
        return Math.toDegrees(Math.acos((firstTopEquation) / (firstBottomEquation)));
    }
    public static double CalculateGrossPay(double hoursWorked, double payRate)
    {
        return hoursWorked * payRate;
    }
    public static double CalculateFederalWithhold(double gross, double federalTaxRate)
    {
        return gross * federalTaxRate;
    }
    public static double CalculateStateWithhold(double gross, double stateTax)
    {
        return gross * stateTax;
    }
    public static double CalculateDeduction(double federalWithhold, double stateWithhold)
    {
        return federalWithhold + stateWithhold;
    }
    public static double CalculateNetPay(double grossPayCalculated, double totalDeduction)
    {
        return grossPayCalculated - totalDeduction;
    }
}
