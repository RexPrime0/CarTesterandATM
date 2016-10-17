/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtester;

/**
 *ATM class, that is..well, an ATM
 * @author Abdo
 */

//declare variables
public class Atm {
public int money;
public String company;

public Atm(int monies, String comp){
  //set starting amounts
   money = monies;
   company = comp;
}
public void display(){
    //display the amount of money on your account
    System.out.println("Your balance is: $" + money );
}
public void add(int extra){
    //takes input, adds it to money
    money += extra;
}
public void less(int less){
    //takes input, removes input from money
    money -= less;
}
public void interest(int rate, int days){
   //calculate the amount of money you got
   
  money = money * ((1 + rate)^days);
}
}
