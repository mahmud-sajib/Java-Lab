/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques8.java;
import java.lang.Math;

class Numbers {
    public static void calculate(int a){
        System.out.println("Number: " + a);
    }
    public static void calculate(int a,int b){
        System.out.println("Square of Number: " + Math.pow(a, b));
    }
    
}

public class Ques8Java {

    public static void main(String[] args) {
        // TODO code application logic here
        Numbers ob1 = new Numbers();
        ob1.calculate(10);
        ob1.calculate(10,2);
    }
 
}


