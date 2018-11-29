/* Joe Gismondi
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises.Exercises;
import Utilities.Helper;
import java.util.Scanner;
/**
 *
 * @author gismo
 */
public class Exercise8 
{
    public static void RunExerciseEight()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 8");
        Exercise8_1();
        Exercise8_5();
        Exercise8_6();
        Exercise8_37();
        System.out.println("Ending Exercise 8");
        Helper.PrintLineBreak();        
    }
    public static void Exercise8_1()
    {
    // 8.1, 8.5, 8.6, 8.37
    // 8.1 Sum Elements Column by Column 
    double[][] matrix = GetMatrix();
    for (int column = 0; column < matrix[0].length; column++)
    {
        System.out.println("Sum of the elements at column " + column + " is " + SumColumn(matrix, column));
    }
    }
    public static double[][] GetMatrix()
    {
      Scanner sumElements = new Scanner(System.in);  
      int rows = 3;
      int columns = 4;
      double[][] sumMatrix = new double[rows][columns];
      System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row");
      for (int row = 0; row < sumMatrix.length; row++)
      {
          for (int column = 0; column < sumMatrix[row].length; column++)
          {
              sumMatrix[row][column]= sumElements.nextDouble();
          }
      }
      return sumMatrix;
    }
    public static double SumColumn(double[][] sumMatrix, int columnIndex)
    {
            double total = 0;
            for (int row = 0; row < sumMatrix.length; row++)
            {
                total+= sumMatrix[row][columnIndex];
            }
            return total; 
        }
    public static void Exercise8_5()
    {
        // 8.5 Add 2 Matrices
        double[][] addedMatrixOne = GetAddedMatrix(1);
        double[][] addedMatrixTwo = GetAddedMatrix(2);
        double[][] totalMatrixThree = AddMatrix(addedMatrixOne, addedMatrixTwo);
        System.out.println("The matrices are added as follows: " + addedMatrixOne + " + " addedMatrixTwo + " = " + totalMatrixThree);              
    }
    public static double[][] GetAddedMatrix(int matrixNumber)
    {
        Scanner addTwoMatrix = new Scanner(System.in);
        System.out.println("Enter Matrix " + matrixNumber + ":");
        double[][] matrixLength = new double[3][3];
        for (int i = 0; i < 3; i++)
        {
           for (int j = 0; j < 3; j++) 
           {
               matrixLength[i][j] = addTwoMatrix.nextDouble();   
           }
        }
        return matrixLength;
    }
    public static double[][] AddMatrix(double[][] matrixA, double[][] matrixB)
    {
        double[][] matrixC = new double[3][3];
        for (int i = 0; i < matrixC.length; i++)
        {
           for (int j = 0; j < matrixC[i].length; j++) 
           {
               matrixC[i][j] = matrixA[i][j] + matrixB[i][j];   
           }
        }
        return matrixC;
    }
    public static void Exercise8_6()
    {
        // 8.6 Multiply 2 Matrices
        double[][] multipliedMatrixOne = GetMultipliedMatrix(1);
        double[][] multipliedMatrixTwo = GetMultipliedMatrix(2);
        double[][] totalMultipliedMatrixThree = MultiplyMatrix(multipliedMatrixOne, multipliedMatrixTwo);
        System.out.println("The multiplication of matices is: " + multipliedMatrixOne + " * " multipliedMatrixTwo + " = " + totalMultipliedMatrixThree);
    }
    public static double[][] GetMultipliedMatrix(int matrixNumber)
    {
        Scanner multiplyTwoMatrix = new Scanner(System.in);
        System.out.println("Enter Matrix " + matrixNumber + ":");
        double[][] matrixLength = new double[3][3];
        for (int i = 0; i < 3; i++)
        {
           for (int j = 0; j < 3; j++) 
           {
               matrixLength[i][j] = multiplyTwoMatrix.nextDouble();   
           }
        }
        return matrixLength;
    }
    public static double[][] MultiplyMatrix(double[][] matrixA, double[][] matrixB)
    {
        double[][] matrixC = new double[3][3];
        for (int i = 0; i < matrixC.length; i++)
        {
           for (int j = 0; j < matrixC[i].length; j++) 
           {
               matrixC[i][j] = matrixA[i][j] * matrixB[i][j];   
           }
        }
        return matrixC;
    }
    public static void Exercise8_37()
    {
        // 8.37 Guess the capitals
        
    }
}
