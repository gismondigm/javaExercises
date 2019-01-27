/* Joe Gismondi
 * CS0422
 * Exercise 9.5
 * Calender
 * 1/16/19
*/
package javaexercises.Exercises;
import java.util.GregorianCalendar;
/**
 *
 * @author gismo
 */
public class Exercise9_5 
{
    public static void RunExerciseNine_Five()
    {
        System.out.println("Exercise 9.5");
        Exercise9_5();
    }
    public static void Exercise9_5() 
    {
       GregorianCalendar calender = new GregorianCalendar();
       System.out.println("The current date: ");
       System.out.println(calender.get(calender.month) + "/" + calender.get(calender.day) + "/" + calender.get(calender.year));
       
       calender.SetTimeInMillis(1234567898765L);
       System.out.println("The elapsed time since January 1, 1970 is: " + calender.SetTimeInMillis(1234567898765L) + " milliseconds");
       System.out.println(calender.get(calender.month) + "/" + calender.get(calender.day) + "/" + calender.get(calender.year));
    }
    
}
