/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques6;

class Shape{
    String shapeName;
    int height;  
    int width;
      
    void info(String shapeName, int height, int width){
        System.out.println(shapeName + " has an area of " + height*width  + " square meters." );
    }  
}  

/**
 *
 * @author Student
 */
public class Ques6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Shape();
        s1.info("Rectangle", 5, 10);
        Shape s2 = new Shape();
        s2.info("Square", 5, 5);
    }
    
}
