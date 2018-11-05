package Utilities;

public class EnumHandler 
{
    public enum Months
    {
        January("January"),
        Feburary("Feburary"),
        March("March"),
        April("April"),
        May("May"),
        June("June"),
        July("July"),
        August("August"), 
        September("September"),
        October("October"), 
        November("November"),
        December("December");
        public final String Name;

        Months(String Name) 
        {
        this.Name = Name;
        }

        public String Name() 
        {   
        return Name;
        }
    }    
}
