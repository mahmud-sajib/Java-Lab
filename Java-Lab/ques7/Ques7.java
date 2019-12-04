/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques7;

class Vehicle{
    String vehicleName;
    int cost;  
      
    void info(String vehicleName, int cost){
        System.out.println(vehicleName + " costs USD " + cost  + "$" );
    }  
}  

public class Ques7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v1 = new Vehicle();
        v1.info("Tesla Truck", 40000);
        Vehicle v2 = new Vehicle();
        v2.info("MiG-29", 150000);
    }
    
}
