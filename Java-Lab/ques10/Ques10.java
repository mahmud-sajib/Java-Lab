/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques10;

class Point{
    int x;
    int y;
    
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle extends Point{
    double r;

    public Circle(int x, int y) {
        super(x, y);
    }
    
    public String toString(){
        double r = 5.0;
        return "Circle[center=(" + x + ", " + y + ");" + " radius= "+r+"]";  
    } 

    void getArea(double r){
        System.out.println("Area: " + 3.1416*r*r);
    }
    
    void getCircumference(double r){
         System.out.println("Circumference: " + 2*3.1416*r);
    }
    
}

public class Ques10 {

    public static void main(String[] args) {
        
        Circle obj = new Circle(75,20);
        obj.getArea(5.0);
        obj.getCircumference(5.0);
        System.out.println(obj);
       
    }
    
}
