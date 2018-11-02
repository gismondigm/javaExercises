package javaexercises.Exercises;

import Utilities.Helper;
import java.util.Scanner;

public class Exercise6 
{
    public static void RunExerciseSix()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 6");
        Exercise6_1();
        System.out.println("Ending Exercise 6");
        Helper.PrintLineBreak();        
    }
    
    private static void Exercise6_1()
    {
        Helper.PrintLineBreak(); 
        System.out.println("6.1 Math: Pentagonal numbers");
        System.out.print("The first 100 Pentagonal Numbers are \n");
        for (int line =1; line <101; line++)
        {
            System.out.printf("%7d ", getPentagonalNumber(line));
            if (line %10==0)
                System.out.println();
        }
        
        Scanner sumInteger = new Scanner(System.in);
        System.out.println("Enter integers to find the sum: ");
        long sumOfInteger = sumInteger.nextLong();
        System.out.println("The sum of the integers is: " + sumDigits(sumOfInteger));        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        displaySortedNumbers(numberOne, numberTwo, numberThree);
        Helper.PrintLineBreak();
    }   
    
    public static int getPentagonalNumber(int number) 
    {
        int pentagonalNumber = (number * (3*number -1))/2;
        return pentagonalNumber;
    }
        // 6.2 Sum digits in integer

    public static long sumDigits (long digit)
    {
      int sum = 0;
      
      while (digit != 0)
      {
          sum +=(digit % 10);
          digit = digit /10;
      }
      return sum;
    }    
        // 6.5 Sort 3 Numbers
    public static void displaySortedNumbers (double numberOne, double numberTwo, double numberThree)
    {
        double temp;    
        if (numberOne > numberTwo && numberThree > numberTwo)
        {
            temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        else if (numberOne > numberThree && numberTwo > numberThree)
        {
            temp = numberOne;
            numberOne = numberThree;
            numberThree = temp;
        }
        if (numberTwo > numberThree)
        {
            temp = numberTwo;
            numberTwo = numberThree;
            numberThree = temp;
        }
        System.out.println(numberOne + " " + numberTwo + " " + numberThree);
    }
}
