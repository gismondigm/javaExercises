package javaexercises.Exercises;

import Utilities.Helper;
import java.util.Scanner;  

public class Exercise5 
{
    public static void RunExerciseFive()
    {
        Helper.PrintLineBreak();
        System.out.println("Starting Exercise 5"); 
        Exercise5_1();
        Exercise5_6();
        Exercise5_17();
        Exercise5_22();
        
    }
    private static void Exercise5_1()
    {
        Helper.PrintLineBreak(); 
        System.out.println("5.1 Positive and Negative Numbers");
        Scanner input = new Scanner(System.in);   
        int count = 0;   
        int positive = 0;   
        int negative = 0;   
        int total = 0;   
        float average;   
        System.out.println("Enter an integer, the input ends if it is 0: ");       
        int integer = input.nextInt();   
        if (integer==0)   
        {                                  
            System.out.println("No numbers are entered except 0");   
            System.exit(1);   
        }                    
        while (integer !=0)   
        {   
            if (integer > 0)   
                positive++;   
            else          
                negative++;   
            total += integer;   
            count++;   
            integer = input.nextInt();   
        }    
        average = total/count;   
        System.out.println("The number of positives are: " + positive);   
        System.out.println("The number of negatives are: " + negative);   
        System.out.println("The Total is: " + total);   
        System.out.println("The average is: " + average);   
        Helper.PrintLineBreak();
    }
    private static void Exercise5_6()
    {
        Helper.PrintLineBreak(); 
        System.out.println("5.6 Miles to Kilometers ");
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");  
        double kilometersPerMile = 1.609;  
        int milesInput;  
        int kilometersInput=20;   
        double milesOutput;  
        double kilometersOutput; 
        double milesRound;
        for (milesInput=1; milesInput <= 10; milesInput++)       
        {  
          kilometersOutput = milesInput * kilometersPerMile; 
          milesOutput = kilometersInput / kilometersPerMile;   
          milesRound =  Math.ceil(milesOutput*1000)/1000.0;          
          System.out.println(milesInput+"\t" + kilometersOutput+"\t\t|\t"+kilometersInput + "\t\t" + milesRound); 
          kilometersInput += 5;                  
        }     
        Helper.PrintLineBreak();
    }
    private static void Exercise5_17()
    {
        Helper.PrintLineBreak(); 
        System.out.println("5.17 Display Pyramid");
        System.out.println("Enter the number of lines between 1-15: ");  
        Scanner pyramid = new Scanner(System.in);  
        int numberOfLines = pyramid.nextInt(); 
        for (int numberOfRows = 1; numberOfRows<=numberOfLines; numberOfRows++) 
        { 
            for (int size = numberOfLines - numberOfRows; size >=1; size--) 
            { 
                System.out.print("  "); 
            } 
            for (int line = numberOfRows; line>=2; line--) 
            { 
                System.out.print(line + " "); 
            } 
            for (int row = 1; row<=numberOfRows; row++) 
            { 
                System.out.print(row + " "); 
            } 
            System.out.println(); 
        } 
        Helper.PrintLineBreak();
    }
    private static void Exercise5_22()
    {
        Helper.PrintLineBreak(); 
        System.out.println("5.22 Financial Application");
        System.out.println("Loan Amount: "); 
        Scanner loan = new Scanner(System.in);
        double loanAmount =loan.nextDouble();
        System.out.println("Number of Years: ");
        int numOfYears =loan.nextInt();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate =loan.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;       
        int payment;
        double monthlyPayment = loanAmount * monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate), numOfYears*12)));
        double totalPayment = monthlyPayment *12*numOfYears;
        double balance = loanAmount;
        double interest;
        double principle;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);        
        System.out.println("Payment#\tInterest\tPrincipal\tBalance");        
        for(payment=1; payment<=numOfYears*12; payment++)
        {
            interest = monthlyInterestRate * balance;
            principle = monthlyPayment - interest;
            balance = balance - principle;       
            System.out.println(payment + "\t\t" + Math.round(interest*100)/100.0 + "\t\t" + Math.round(principle*100)/100.0 + "\t\t" + Math.ceil(balance*100)/100.0);
        }
        Helper.PrintLineBreak();
    }
    private static void Exercise5_45()
    {
        Helper.PrintLineBreak(); 
        System.out.println("5.45 Mean and Standard Deviation");
        System.out.println("Enter 10 numbers: ");
        Scanner stats = new Scanner(System.in);
        double statTotal=0;
        double totalSquared=0;
        double standardDeviation;
        double mean;
        for(int numberInput=0; numberInput<10; numberInput++)
        {
            double numbers = stats.nextDouble();
            statTotal += numbers;
            totalSquared += Math.pow(numbers,2.0);
        }
        standardDeviation = Math.pow((totalSquared - statTotal * statTotal/10)/9, .5);
        mean = statTotal/10;       
        System.out.println("The mean is: " + mean);
        System.out.println("The Standard Deviation is: " + standardDeviation);
        System.out.println("Ending Exercise 5");
        Helper.PrintLineBreak();
    }
}
