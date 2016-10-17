/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import javax.swing.*;
/**
 *
 * @author Abels6598
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare the cars
        Car car1;
        Car car2;
        Car car3;
      for(int i = 0; i<=3; i++){
          /* Asks the user to create a car three times
          Prints the properties of said car after the car is created
          1st choice uses full constructor
          2nd choice uses price only constructor
          3rd choice suses deafult constructor 
          */
        String choice = JOptionPane.showInputDialog(
        "Creating Car Object:\n"
        + "1 - Create your own car\n"
        + "2 - Create car based on price\n")
        + "3 - Create a deafult car, I am lazy";
      
       if(choice.equals("1")){
           //ask user for car properties, pass them into the constructor
           String make = JOptionPane.showInputDialog("Enter the car's make");
           String model = JOptionPane.showInputDialog("Enter the car's model");
           String thruster = JOptionPane.showInputDialog("Enter the car's thruster engine type");
           String sprice = JOptionPane.showInputDialog("Enter the car's price");
           String sseats = JOptionPane.showInputDialog("Enter the amount of seats in the car");
           String syear = JOptionPane.showInputDialog("Enter the car's year");
           
           int price = Integer.parseInt(sprice);
           int seats = Integer.parseInt(sseats);
           int year = Integer.parseInt(syear);
           //prints properties of the car, and sets them
           if(i == 0){
               car1 = new Car(model, thruster, make, year, seats, price);
               System.out.println(car1.toString());
               System.out.println("--------------------------");
           }
           if(i == 1){
               car2 = new Car(model, thruster, make, year, seats, price);
               System.out.println(car2.toString());
               System.out.println("--------------------------");
           }
           if(i == 2){
               car3 = new Car(model, thruster, make, year, seats, price);
               System.out.println(car3.toString());
               System.out.println("--------------------------");
           }
        }
        if(choice.equals("2")){
           String sprice = JOptionPane.showInputDialog("Enter the car's price");
           int price = Integer.parseInt(sprice);
           //prints properties of the car, and sets them
           if(i == 0){
               car1 = new Car(price);
               System.out.println(car1.toString());
               System.out.println("--------------------------");
           }
           if(i == 1){
               car2 = new Car(price);
               System.out.println(car2.toString());
               System.out.println("--------------------------");
           }
           if(i == 2){
               car3 = new Car(price);
               System.out.println(car3.toString());
               System.out.println("--------------------------");
           }
        }
         if(choice.equals("3")){
             //prints properties of the car, and sets them
              if(i == 0){
               car1 = new Car();
               System.out.println(car1.toString());
               System.out.println("--------------------------");
           }
              if(i == 1){
               car2 = new Car();
               System.out.println(car2.toString());
               System.out.println("--------------------------");
           }
              if(i == 2){
               car3 = new Car();
               System.out.println(car3.toString());
               System.out.println("--------------------------");
               
           }
       }
       
    }
    }
    
}
