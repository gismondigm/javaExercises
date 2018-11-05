package Models;

import Utilities.Helper;

public class Circle 
{
    public double Radius;
    public double RandomAngle1;
    public double RandomAngle2;
    public double RandomAngle3;
    public double X1;
    public double X2;
    public double X3;
    public double Y1;
    public double Y2;
    public double Y3;
    public double Side1;
    public double Side2;
    public double Side3;
    public double SideSquared1;
    public double SideSquared2;
    public double SideSquared3;
    public double PolygonAngle1;
    public double PolygonAngle2;
    public double PolygonAngle3;
    
    public Circle(double radius)
    {
        Radius = radius;
        SetRandomAngles();
        SetPoints();
        SetSides();
        SetPolygon();
    }
    private void SetRandomAngles()
    {
       RandomAngle1 = Helper.CalculateRandomAngle(); 
       RandomAngle2 = Helper.CalculateRandomAngle(); 
       RandomAngle3 = Helper.CalculateRandomAngle(); 
    }
    private void SetPoints()
    {
       X1 = Helper.CalculateRandomPointOnCircleFromRadiusX(Radius, RandomAngle1); 
       X2 = Helper.CalculateRandomPointOnCircleFromRadiusX(Radius, RandomAngle2);  
       X3 = Helper.CalculateRandomPointOnCircleFromRadiusX(Radius, RandomAngle3);       
       Y1 = Helper.CalculateRandomPointOnCircleFromRadiusY(Radius, RandomAngle1); 
       Y2 = Helper.CalculateRandomPointOnCircleFromRadiusY(Radius, RandomAngle2);  
       Y3 = Helper.CalculateRandomPointOnCircleFromRadiusY(Radius, RandomAngle3); 
    }
    private void SetSides()
    {
       Side1 = Helper.CalculateSideOfPolygonFromPoints(X2, X3, Y2, Y3); 
       Side2 = Helper.CalculateSideOfPolygonFromPoints(X1, X3, Y1, Y3);  
       Side3 = Helper.CalculateSideOfPolygonFromPoints(X1, X2, Y1, Y2);  
       SideSquared1 = Math.pow(Side1, 2);
       SideSquared2 = Math.pow(Side2, 2);
       SideSquared3 = Math.pow(Side3, 2);
    }
    private void SetPolygon()
    {
       PolygonAngle1 = Helper.CalculateAngleOfPolygon(SideSquared1, SideSquared2, SideSquared3, Side2, Side3);
       PolygonAngle2 = Helper.CalculateAngleOfPolygon(SideSquared2, SideSquared1, SideSquared3, Side1, Side3);
       PolygonAngle3 = Helper.CalculateAngleOfPolygon(SideSquared3, SideSquared2, SideSquared1, Side1, Side2);
    }
}
