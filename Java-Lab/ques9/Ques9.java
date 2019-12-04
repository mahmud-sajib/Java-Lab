/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques9;

class Calculation{
    int z;
    void addition(int x,int y){
        z = x+y;
        System.out.println("Addition: " + z);
    }
    void subtraction(int x, int y){
        z = x-y;
        System.out.println("Subtraction: " + z);
    }
}

class My_Calculation extends Calculation{
    void multiplication(int x,int y){
        z = x*y;
        System.out.println("Multiplication: " + z);
    }
}


public class Ques9 {

    public static void main(String[] args) {
        // TODO code application logic here
        My_Calculation ob1 = new My_Calculation();
        ob1.addition(10,5);
        ob1.subtraction(10,5);
        ob1.multiplication(10,5);
    }
    
}
