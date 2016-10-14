/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author Abels6598
 */
public class Car {
    //intilaize variables
    public int year;
    public int price;
    public int seats;
    public String model;
    public String make;
    public String thruster;
   
    public Car(){
        //no inputs, sets default variables
        //deafult constructer
        year = 2077;
        price = 45000;
        seats = 5;
        model = "C0NVENINCE";
        make = "CY-TECH";
        thruster = "Rail"; 
    }
    public Car(String modl, String thrust, String mak, int yr, int seat, int pric){
        //constructer using 6 inputs, 3 strings, and 3 ints. 
        //user input is set to car properties
        
           year = yr;
           price = pric;
           seats = seat;
           model = modl;
           make = mak;
           thruster = thrust; 
    }
    public Car(int pric){
        //sets the car's properties based on price inputted
         price = pric;
        if(price<=50000&&price<=40000){
            
            year = 2077;
            seats = 5;
            model = "C0NVENINCE";
            make = "CY-TECH";
            thruster = "Rail"; 
        }
        else {
            year = 2079;
            seats = 4;
            model = "KRAZY";
            make = "CARMAKERS";
            thruster = "Float";
        }
    }
     public String toString(){
         
         //prints the properties of the car into the console
         String output = "Make: " + make + "\n";
         output += "Model: " + model + "\n";
         output += "Thruster type: " + thruster + "\n";
         output += "Seats: " + seats + "\n";
         output += "Price: " + price + "\n";
         output += "Year: " + year + "\n";
         return output;
     }
     public void honk(){
         //honks the horn of the car
         
         System.out.println("BWEEP BWEEP!");
     }
}
