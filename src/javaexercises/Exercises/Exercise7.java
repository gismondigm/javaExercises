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
        Exercise7_3();
        Exercise7_8();
        Exercise7_11();
        Exercise7_15();
        Exercise7_31();
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
        Helper.PrintLineBreak(); 
        Scanner input = new Scanner(System.in);
        System.out.println("7.1 Assign Grades");
        System.out.println("Enter the number of students");
        int [] score = new int[input.nextInt()]; 
        char [] grade = new char[score.length];
        System.out.println("Enter " + score.length + " scores: ");
        for (int i = 0; i < score.length; i++)
        {
            score[i] = input.nextInt();
        }
        DisplayGrade(score,grade);
        for (int i = 0; i < score.length; i++)
        {
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade[i]);
        }
        Helper.PrintLineBreak();
    }
    public static void Exercise7_3()
    {
        Helper.PrintLineBreak();
        System.out.println("7.3 Count occurence of numbers");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100:");
        int[] inputValues = new int[100];
        int count = 0;
        int inputIntegers;
        do 
        {
           inputIntegers = in.nextInt();
           inputValues[count] = inputIntegers;
           count+=1;
        }
        while (inputIntegers != 0);
        IntegerOccurence(inputValues);
        Helper.PrintLineBreak();
    }
    public static void Exercise7_8()
    {
        Helper.PrintLineBreak();
        System.out.println("7.8 Average an array");
        Scanner numberAverageScanner = new Scanner(System.in);
        System.out.println("Enter 10 values to find an average");
        double[] numbersToAverage = new double[10];
        for (int i = 0; i < 10; i++)
        {
            numbersToAverage[i] = numberAverageScanner.nextInt();
        }
        System.out.println("The average is: " + CalculateAverage(numbersToAverage));
        Helper.PrintLineBreak();
    }
    public static void Exercise7_11()
    {
        Helper.PrintLineBreak();
        System.out.println("7.11 Stats Compute Standard Deviation");
        Scanner deviationAndMean = new Scanner(System.in);
        int size = 10;
        double[] standardDeviationAndMean = new double[size];
        System.out.println("Enter " + size + " numbers to display the mean and standard deviation:");
        for (int i = 0; i < standardDeviationAndMean.length; i++)
        {
            standardDeviationAndMean[i] = deviationAndMean.nextDouble();            
        }
        System.out.println("The mean is: " + Helper.Round(CalculateMean(standardDeviationAndMean)));
        System.out.println("The standard deviation is: " + Helper.Round(CalculateStandardDeviation(standardDeviationAndMean)));
        Helper.PrintLineBreak();
    }
    public static void Exercise7_15()
    {
        Helper.PrintLineBreak();
        System.out.println("7.15 Eliminate Duplicates");
        Scanner duplicates = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int numbers = duplicates.nextInt();
        int[] numberArray = new int[numbers];
        System.out.println("Enter " + numbers + " numbers: ");
        for (int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = duplicates.nextInt();
        }
        numberArray = EliminateDuplicatesFromArray(numberArray);
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < numberArray.length; i++)
        {
            System.out.println(numberArray[i]);
        }
        Helper.PrintLineBreak();
    }
    public static void Exercise7_31()
    {
        Helper.PrintLineBreak();
        System.out.println("7.31 Merge two sorted lists");
        Scanner mergeScanner = new Scanner(System.in);
        System.out.println("Enter list 1 size and contents: ");
        int[] listOne = new int[mergeScanner.nextInt()];        
        for (int i = 0; i < listOne.length; i++)
        {
            listOne[i] = mergeScanner.nextInt();
        }
        System.out.println("Enter list 2 size and contents: ");
        int[] listTwo = new int[mergeScanner.nextInt()];
        for (int i = 0; i < listTwo.length; i++)
        {
            listTwo[i] = mergeScanner.nextInt();
        }       
        
        System.out.print("List 1 is: ");
        for (int i = 0; i < listOne.length; i++)
        {
            System.out.print(" " + listOne[i] + " ");
        }
        System.out.println();
        System.out.print("List 2 is: ");
        for (int i = 0; i < listTwo.length; i++)
        {
            System.out.print(" " + listTwo[i] + " ");
        }
        System.out.println();
        System.out.print("Merge List is: ");
        int[] mergeList = MergeLists(listOne, listTwo);
        for (int i = 0; i < mergeList.length; i++)
        {
            System.out.print(" " + mergeList[i] + " ");
        }
        System.out.println();
        Helper.PrintLineBreak();
    }
    
    public static void DisplayGrade(int[] score, char[] grade)
    {
        int bestScore = HighScore(score);
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
    public static int HighScore(int[] list)
    {
        int highScore = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] > highScore)
            {
                highScore = list[i];
            }
            
        }
        return highScore;
    }       
    public static void IntegerOccurence (int[]list)
    {       
        for (int i = 1; i <= 100; i++)
        {
            String timeString = "time";
            int count = 0;
            for (int j = 0; j < list.length - 1; j++)
            {
                if (list[j] == i)
                {
                    count+=1;                                                       
                }                  
            }
            if (count !=0)
            {
                if (count > 1)
                {
                    timeString = "times";                        
                }
                System.out.println(i + " occurs " + count + " " + timeString);
            }  
        }            
    }        
    
    public static int CalculateAverage (int[]array)
    {
       int sum = 0;
       for (int numbersToAverage : array)
           sum+=numbersToAverage;
       return sum / array.length;
    }
    public static double CalculateAverage (double[]array)
    {
        double sum = 0;
        for (double numbersToAverage : array)
            sum+=numbersToAverage;
        return sum / array.length;
    }         
    public static double CalculateMean (double[] numberArray)
    {
        double statTotal = 0;
        for (int i = 0; i < numberArray.length; i++)
        {
            statTotal += numberArray[i];
        }
        return statTotal / numberArray.length;        
    }
    public static double CalculateStandardDeviation (double[] numberArray)
    {
        double mean = CalculateMean(numberArray);
        double standardDeviation = 0;
        for (int i = 0; i < numberArray.length; i++)
        {
           standardDeviation +=Math.pow(numberArray[i] - mean, 2); 
        }
        return Math.sqrt(standardDeviation / (numberArray.length - 1));         
    }         
    
    public static int[] EliminateDuplicatesFromArray(int[] numberArray)
    {        
        int count = 0;
        boolean isDuplicate = false;
        int[] duplicateArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) 
        {           
            for (int j = 0; j < numberArray.length; j++) 
            {
                if (duplicateArray[j] == numberArray[i]) 
                {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) 
            {
                duplicateArray[count++] = numberArray[i];
            }
            isDuplicate = false;
        }
        int[] duplicateArrayEliminated = new int[count];
        for (int i = 0; i < count; i++) 
        {
            duplicateArrayEliminated[i] = duplicateArray[i];
        }
        return duplicateArrayEliminated;
    }  
    public static int[] MergeLists(int[] listOne, int[] listTwo)
    {
        int[] mergeList = new int[listOne.length + listTwo.length];
        int count = 0;
        int sortValue;
        for (int i = 0; i < listOne.length; i++)
        {
           mergeList[i] = listOne[i]; 
           count++;
        }
        for (int i = 0; i < listTwo.length; i++)
        {
           mergeList[count] = listTwo[i]; 
           count++;
        }
        for (int i = 0; i < mergeList.length; i++)
        {
            for (int j = i+1; j < mergeList.length; j++)
            {
                if (mergeList[i] > mergeList[j])
                {
                    sortValue = mergeList[i];
                    mergeList[i] = mergeList[j];
                    mergeList[j] = sortValue;
                }
            }
        }
        return mergeList;
    } 
    private static void DisplayStudentsAndGrades(List<Grade> gradeList)
    {
        for (int i = 0; i < gradeList.size(); i++) 
        {
            System.out.println(gradeList.get(i).Student.DisplayName + " With Score: " + gradeList.get(i).Score + " Got Letter Grade: " +gradeList.get(i).LetterGrade);
        }
    }
}
