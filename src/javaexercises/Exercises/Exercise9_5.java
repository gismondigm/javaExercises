/* Joe Gismondi
 * CS0422
 * Exercise 9.5
 * Calender
 * 1/16/19
*/
package javaexercises.Exercises;
import java.util.Calendar;
import java.util.Date;
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        String today = new Date().toString();
        long timeMilliseconds = 1234567898765L;
        System.out.println(today);        
        gregorianCalendar.setTimeInMillis(timeMilliseconds);
        System.out.printf("Milliseconds: "+timeMilliseconds+" Year: "+gregorianCalendar.get(Calendar.YEAR)+" Month: "+gregorianCalendar.get(Calendar.MONTH)+" Day: "+gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }    
}
