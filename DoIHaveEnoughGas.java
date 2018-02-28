/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Evaluate if there is enough gallons of gas in car to make it to the next gas station
 * @author NICHOLAS
 */
public class DoIHaveEnoughGas {
    // main method
    public static void main(String [] args) {
        
        // hard-code standard hwy mpg value of 28mpg
        final int STANDARD_HWY_MPG = 28;
        
        // declare an int-type variable to store the gallons 
        //of gas left in car and miles to next station
        int gasLeft;
        int milesToNextGasStation;
        
        
        // create a Scanner object to get values from the keyboard
        Scanner userInputScanner = new Scanner(System.in);
        //prompt user for gallons of gas in car
        System.out.println("Enter gallons of gas left in car and press enter: ");
        // read whatever user typed in keyboard into variable gasLeft
        gasLeft = userInputScanner.nextInt();
        // prompt user for miles to next gas station
        System.out.println("Enter miles to next gas station and press enter ");
        // read whatever user typed in keyboard into the variable milesToNextGasStation
        milesToNextGasStation = userInputScanner.nextInt();
        // evaluate if there is enough gas in vehicle to travel the distance to the next gas station
        if(milesToNextGasStation <= (STANDARD_HWY_MPG * gasLeft)) {
        // code to run if there is enough gas to make it to the station
            System.out.println("You'll make it to the next station!");
            
        } else {
            // code if there is not enough gas to make it to station
            System.out.println("Red Alert! You'll soon be marooned. Sucker!");
        }
        
        
        
        
        
        
        
        
        
    } // close main method  
} // en class DoIHaveEnoughGas
