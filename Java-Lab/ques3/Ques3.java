/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques3;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        /* Input temperature in Celsius from user */
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        
        /* Convert Celsius to Fahrenheit */
        float F = C * (9f / 5) + 32;
        
        /* Print result */
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
    }
    
}
