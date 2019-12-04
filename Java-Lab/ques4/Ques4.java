/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques4;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");
        int n = myObj.nextInt();
        
        if(n%2==0){
            System.out.println(n+ " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
    
}
