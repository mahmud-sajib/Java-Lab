/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class Ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter First person name");
        String name1 = myObj.nextLine();
        System.out.println("Enter Second person name");
        String name2 = myObj.nextLine();
        System.out.println("Enter Third person name");
        String name3 = myObj.nextLine();
        System.out.println("Hi " + name3 + ", " + name2 + " and " + name1);  // Output user input
    }
    
}
