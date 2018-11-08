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
    
    private static void Exercise7_1()
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
    private static void DisplayStudentsAndGrades(List<Grade> gradeList)
    {
        for (int i = 0; i < gradeList.size(); i++) 
        {
            System.out.println(gradeList.get(i).Student.DisplayName + " With Score: " + gradeList.get(i).Score + " Got Letter Grade: " +gradeList.get(i).LetterGrade);
        }
    }
}
