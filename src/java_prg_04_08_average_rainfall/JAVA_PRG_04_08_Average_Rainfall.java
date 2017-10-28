/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_08_average_rainfall;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that uses nested loops to collect data and calculate the
 * average rainfall over a period of years. First the program should ask for
 * the total number of years. The outer loop will iterate once for each year.
 * The inner loop will iterate 12 times, once for each month. After all
 * iterations, the program should display the number of months, the total
 * inches of rainfall, and the average rainfall per month for the entire
 * period.
 * 
 * Input Validation: Do not accept a number less than 1 for the number of years.
 * Do not accept negative numbers for the monthly rainfall.
 */
public class JAVA_PRG_04_08_Average_Rainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final int INT_MONTHS_IN_A_YEAR = 12;
        
        int intNumYears;
        
        int intMonthCounter = 0;
        
        float fltRainMonthly;
        float fltRainTotal = 0;
        float fltRainAverage;
        
        String strUserInput;
        
        do {
            strUserInput = JOptionPane.showInputDialog("Please enter the number"
                    + " of years you\nwould like to calculate average rainfall"
                    + " for.");
            intNumYears = Integer.parseInt(strUserInput);
        } while(intNumYears <= 0 || intNumYears > 10);
        
        for(int i = 0 ; i < intNumYears ; i++)
        {
            for(int j = 0 ; j < INT_MONTHS_IN_A_YEAR ; j++)
            {
                do {
                    strUserInput = JOptionPane.showInputDialog("Please enter the"
                            + " amount of rain that fell in month " + (j + 1) + ".");
                    fltRainMonthly = Float.parseFloat(strUserInput);
                } while (fltRainMonthly < 0 || fltRainMonthly > 10000);
                
                fltRainTotal += fltRainMonthly;
                intMonthCounter++;
            }
        }
        
        fltRainAverage = fltRainTotal / intMonthCounter;
        
        strUserInput = String.format("Your total rainfall was %.2f and\n"
                + "the average rainfall was %.2f.", fltRainTotal, fltRainAverage);
        
        JOptionPane.showMessageDialog(null, strUserInput);
        
        System.exit(0);
    }
    
}
