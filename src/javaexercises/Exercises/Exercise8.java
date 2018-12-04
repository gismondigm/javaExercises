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
public class Exercise8 {

    public static void RunExerciseEight() {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 8");
        //Exercise8_1();
        //Exercise8_5();
        Exercise8_6();
        Exercise8_37();
        System.out.println("Ending Exercise 8");
        Helper.PrintLineBreak();
    }

    public static void Exercise8_1() {
    // 8.1, 8.5, 8.6, 8.37
        // 8.1 Sum Elements Column by Column 
        double[][] matrix = GetMatrix();
        for (int column = 0; column < matrix[0].length; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + SumColumn(matrix, column));
        }
    }

    public static double[][] GetMatrix() {
        Scanner sumElements = new Scanner(System.in);
        int matrixRows = 3;
        int matrixColumns = 4;
        double[][] sumMatrix = new double[matrixRows][matrixColumns];
        System.out.println("Enter a " + matrixRows + "-by-" + matrixColumns + " matrix row by row");
        for (int row = 0; row < sumMatrix.length; row++) {
            for (int column = 0; column < sumMatrix[row].length; column++) {
                sumMatrix[row][column] = sumElements.nextDouble();
            }
        }
        return sumMatrix;
    }

    public static double SumColumn(double[][] sumMatrix, int columnIndex) {
        double total = 0;
        for (int row = 0; row < sumMatrix.length; row++) {
            total += sumMatrix[row][columnIndex];
        }
        return total;
    }

    public static void Exercise8_5() {
        // 8.5 Add 2 Matrices
        System.out.println("Exercise 8.5 add two matrices:");
        double[][] addedMatrixOne = GetAddedMatrix(1);
        double[][] addedMatrixTwo = GetAddedMatrix(2);
        double[][] totalMatrixThree = AddMatrix(addedMatrixOne, addedMatrixTwo);
        System.out.println("The matrices are added as follows: ");
        PrintMatrix(addedMatrixOne, addedMatrixTwo, totalMatrixThree, "+");
    }

    private static void PrintMatrix(double[][] whatsInYourWalletMatrix, double[][] capitalOneMatrix, double[][] morganFreemanMatrix, String leftSymbol) {
        for (int i = 0; i < morganFreemanMatrix.length; i++) {
            PrintLoop(whatsInYourWalletMatrix, morganFreemanMatrix, leftSymbol, i);
            PrintLoop(capitalOneMatrix, morganFreemanMatrix, "=", i);
            for (int j = 0; j < morganFreemanMatrix[0].length; j++) {
                System.out.print(Round(morganFreemanMatrix[i][j]));
                System.out.print("\t");
            }
            System.out.println();
        }

    }

    private static void PrintLoop(double[][] matrixToBePrinted, double[][] loopedMatrix, String symbol, int i) {
        for (int j = 0; j < loopedMatrix[0].length; j++) {
            System.out.print(Round(matrixToBePrinted[i][j]));
            if (i == 1 && j == 2) {
                System.out.print("  " + symbol + "  ");
            } else {
                System.out.print("\t");
            }
        }
    }

    public static double[][] GetAddedMatrix(int matrixNumber) {
        Scanner addTwoMatrix = new Scanner(System.in);
        System.out.println("Enter Matrix " + matrixNumber + ":");
        double[][] matrixLength = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixLength[i][j] = addTwoMatrix.nextDouble();
            }
        }
        return matrixLength;
    }

    public static double[][] AddMatrix(double[][] matrixLeft, double[][] matrixRight) {
        double[][] matrixAdded = new double[3][3];
        for (int i = 0; i < matrixAdded.length; i++) {
            for (int j = 0; j < matrixAdded[i].length; j++) {
                matrixAdded[i][j] = matrixLeft[i][j] + matrixRight[i][j];
            }
        }
        return matrixAdded;
    }

    public static void Exercise8_6() {
        // 8.6 Multiply 2 Matrices
        System.out.println("Exercise 8.6 multiply two matrices:");
        double[][] multipliedMatrixOne = GetMultipliedMatrix(1);
        double[][] multipliedMatrixTwo = GetMultipliedMatrix(2);
        double[][] totalMultipliedMatrixThree = MultiplyMatrix(multipliedMatrixOne, multipliedMatrixTwo);
        System.out.println("The matrices are multiplied as follows: ");
        PrintMatrix(multipliedMatrixOne, multipliedMatrixTwo, totalMultipliedMatrixThree, "*");
    }

    public static double[][] GetMultipliedMatrix(int matrixNumber) {
        Scanner multiplyTwoMatrix = new Scanner(System.in);
        System.out.println("Enter Matrix " + matrixNumber + ":");
        double[][] matrixLength = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixLength[i][j] = multiplyTwoMatrix.nextDouble();
            }
        }
        return matrixLength;
    }

    public static double[][] MultiplyMatrix(double[][] matrixLeft, double[][] matrixRight) {
        double[][] matrixMultiplied = new double[3][3];
        for (int i = 0; i < matrixMultiplied.length; i++) {
            for (int j = 0; j < matrixMultiplied[0].length; j++) {
                for (int k = 0; k < matrixLeft[0].length; k++) {
                    matrixMultiplied[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return matrixMultiplied;
    }

    public static void Exercise8_37() {
        // 8.37 Guess the capitals
        Scanner guessCapitals = new Scanner(System.in);
        String[][] capitalsOfStates = DisplayCapitals();
        for (int i = 0; i < capitalsOfStates.length; i++) {
            System.out.println("What is the capital of " + capitalsOfStates + "?");
        }

    }

    public static String[][] DisplayCapitals() {
        String[][] matrixC = new String[3][3];
        return matrixC;
    }

    public static double Round(double input) {
        return (Math.round(input * 100) / 100.0);
    }
}
