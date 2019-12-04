/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter principal amount");
        int p = myObj.nextInt();
        System.out.println("Enter rate of interest");
        int r = myObj.nextInt();
        System.out.println("Enter number of years");
        int n = myObj.nextInt();
        System.out.println("simple interest (SI): " + (p*r*n)/100);
    }
    
}
