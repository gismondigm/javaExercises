package javaexercises.Exercises;

import Models.Grade;
import Utilities.Helper;
import java.util.List;
import java.util.Scanner;

public class Exercise7 
{
    public static void RunExerciseSeven()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 7");
        Exercise7_1();
        System.out.println("Ending Exercise 7");
        Helper.PrintLineBreak();        
    }
    
    public static void Exercise7_1_Refactored()
    {
        Helper.PrintLineBreak(); 
        System.out.println("7.1");
        System.out.println("How many scores do you want to submit?: ");
        Scanner intScanner = new Scanner(System.in);
        int numberOfScores = intScanner.nextInt();
        System.out.println("Enter "+numberOfScores+" scores: ");
        DisplayStudentsAndGrades(Helper.GetGradesFromLargestNumber(Helper.GetArrayFromInputByLength(numberOfScores)));
        Helper.PrintLineBreak();
    }
    
    public static void Exercise7_1()
    {
     // 7.1 7.3, 7.8, 7.11, 7.15, 7.31
        Scanner input = new Scanner(System.in);
        // 7.1 Assign Grades
        System.out.println("Enter the number of students");
        int [] score = new int[input.nextInt()]; 
        char [] grade = new char[score.length];
        System.out.println("Enter " + score.length + " scores: ");
        for (int i = 0; i < score.length; i++)
        {
            score[i] = input.nextInt();
        }
        displayGrade(score,grade);
        for (int i = 0; i < score.length; i++)
        {
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade[i]);
        }
        // 7.3 Count occurence of numbers
        System.out.println("Enter the integers between 1 and 100:");
        int[] inputValues = new int[100];
        int count = 0;
        int inputIntegers;
        do 
        {
           inputIntegers = input.nextInt();
           inputValues[count] = inputIntegers;
           count+=1;
        }
        while (inputIntegers != 0);
        integerOccurence(inputValues);
        // 7.8 Average an array
        System.out.println("Enter 10 values to find an average");
        double[] numbersToAverage = new double[10];
        for (int i = 0; i < 10; i++)
        {
            numbersToAverage[i] = input.nextInt();
            System.out.println("The average is: " + average(numbersToAverage));
            // Need it to input 10 numbers during test instead of 1
        }
        // 7.11 Stats Compute Standard Deviation
        // Test program to enter 10 numbers to display mean and standard deviation. Store numbers in an array
        
    }
    public static int average (int[]array)
    {
       int sum = 0;
       for (int numbersToAverage : array)
           sum+=numbersToAverage;
       return sum / array.length;
    }
    public static double average (double[]array)
    {
        double sum = 0;
        for (double numbersToAverage : array)
            sum+=numbersToAverage;
        return sum / array.length;
    }
    public static void integerOccurence (int[]list)
    {
        for (int i = 1; i <= 100; i++)
        {
            int count = 0;
        for (int j = 0; j < list.length - 1; j++)
        {
            if (list[j] == i)
                count+=1;
        }
        if (count != 0)
            System.out.println(i + " occurs " + count + " time");
        // Need to change time to times if occurence is greater than 1
        }            
    }
    public static int highScore(int[] list)
    {
        int highScore = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] > highScore)
            {
                highScore = list[i];
            }
            
        }
        return highScore;
    }
    
    public static void displayGrade(int[] score, char[] grade)
    {
        int bestScore = highScore(score);
        for (int i = 0; i < score.length; i++)
        {
            if (score[i] >= bestScore -10)
                grade[i] = 'A';
            else if (score[i] >= bestScore -20)
                grade[i] = 'B';
            else if (score[i] >= bestScore -30)
                grade[i] = 'C';
            else if (score[i] >= bestScore -40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }
    }
    private static void DisplayStudentsAndGrades(List<Grade> gradeList)
    {
        for (int i = 0; i < gradeList.size(); i++) 
        {
            System.out.println(gradeList.get(i).Student.DisplayName + " With Score: " + gradeList.get(i).Score + " Got Letter Grade: " +gradeList.get(i).LetterGrade);
        }
    }
}
