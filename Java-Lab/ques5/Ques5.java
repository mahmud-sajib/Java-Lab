/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques5;

class Dog{
    int weight;  
    String color;
    String name;
      
    void info(String name, String color, int weight){
        System.out.println(name + " is a " + color + " colored dog & his weight is " + weight + " lbs");
    }  
}  

public class Ques5 {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.info("Tommy", "Red", 50);
        Dog d2 = new Dog();
        d1.info("Jimmy", "Black", 40);
       
    }
    
}
