/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.mavenproject1;
import java.util.Scanner;

/*A car’s miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used .This is a program that asks the user for the number of miles 
driven and the gallons of gas used. It calculate car’s miles-per-gallon and display the result on the screen.
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double numberOfMilesDriven;
        double gallonsOfGasUsed;
        double MPG; //miles per gallons
         
        System.out.println("Enter the number of miles driven: ");
        numberOfMilesDriven = keyboard.nextDouble();
        
        System.out.println("Enter the gallons of gas used: ");
        gallonsOfGasUsed = keyboard.nextDouble();
        
        MPG = numberOfMilesDriven / gallonsOfGasUsed;
        
        System.out.println("Your vehicle travelled " + MPG + " miles per gallons");
        
    }
}
