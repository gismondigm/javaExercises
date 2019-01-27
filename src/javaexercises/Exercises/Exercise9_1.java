/* Joe Gismondi
 * CS0422
 * Exercise 9.1
 * 1/16/19
 */
package javaexercises.Exercises;

/**
 *
 * @author gismo
 */


/**		UML Diagram
	----------------------------------------------------------------------
	|		Class: Rectangle		|
	----------------------------------------------------------------------
	|	Data field: width:double			|
	|	height:double				|
	----------------------------------------------------------------------
	|	Rectangle()			|
	|	Rectangle(setWidth: double)				|
	|	Rectangle(setHeight: double)				|
        *       getArea(): double
        *       getPerimeter(): double
	----------------------------------------------------------------------
*/

public class Exercise9_1 
{
    public static void RunExerciseNine_One()
    {
        System.out.println("Exercise 9.1");
        Exercise9_1();
    }
    public static void Exercise9_1()
    {
        Rectangle rectangleOne = new Rectangle(4,40);
        Rectangle rectangleTwo = new Rectangle(3.5,35.9);

        System.out.println("The width of the rectangle 1 is: " + rectangleOne.width);
        System.out.println("The height of the rectangle 1 is: " + rectangleOne.height);
        System.out.println("The area of the rectangle 1 is: " + rectangleOne.getArea());
        System.out.println("The perimeter of the rectangle 1 is: " + rectangleOne.getPerimeter());
        
        System.out.println("\nThe width of the rectangle 2 is: " + rectangleTwo.width);
        System.out.println("The height of the rectangle 2 is: " + rectangleTwo.height);
        System.out.println("The area of the rectangle 2 is: " + rectangleTwo.getArea());
        System.out.println("The perimeter of the rectangle 2 is: " + rectangleTwo.getPerimeter());
    }
}
        class Rectangle 
    {
        double width;
        double height;
        
       public Rectangle()
        {
            width = 1;
            height = 1;
        }
        double getArea()
        {
           return width * height; 
        
        }
        double getPerimeter()
        {
            return 2 * (width + height);
        }
        public Rectangle(double w, double h)
        {
            width = w;
            height = h;       
        }
        public void setWidth (double w)
        {
            width = w;
        }
        public void setHeight(double h)
        {
            height = h;
        }  
        public double getWidth()
        {
            return width;
        }
        public double getHeight()
        {
            return height;
        }
    }
    
