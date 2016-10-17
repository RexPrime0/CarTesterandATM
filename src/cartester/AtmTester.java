 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;
import javax.swing.*;
/**
 *
 * @author Abdo
 */
public class AtmTester {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here I know this is wrong captilization
        //intiliaze variables
        Atm Atm1;
        boolean shutdown = false;
        String bank = JOptionPane.showInputDialog(
        "ATM Machine: Input the name of your bank");
        String startS = JOptionPane.showInputDialog("Input your starting balance");
        int startBalance = Integer.parseInt(startS);
        //intiliazes the atm machine
        Atm1 = new Atm(startBalance, bank);
        while(shutdown = false){
             //repeats until the player says that this needs 
             String choice = JOptionPane.showInputDialog(
              "ATM interface:\n"
            + "1 - Despoit\n"
            + "2 - Withdraw\n")
            + "3 - Calculate Daily Interest\n"
            + "4 - View balance\n"
            + "5 - Shutdown the program";
             
             if(choice.equals("1")){
                 //asks user for money, inputs it to method
                 String moneyS = JOptionPane.showInputDialog("Input the amount of money you  want to add");
                 int money = Integer.parseInt(moneyS);
                 Atm1.add(money);
             }
             if(choice.equals("2")){
                 //asks user for money, inputs it to method
                 String moneyS = JOptionPane.showInputDialog("Input the amount of money you want to remove");
                 int money = Integer.parseInt(moneyS);
                 Atm1.less(money);
             }
             if(choice.equals("3")){
                 //asks user for money, inputs it to withdraw method
                 String rateS = JOptionPane.showInputDialog("Input the amount of money you want to remove");
                 int rate = Integer.parseInt(rateS);
                 String timeS = JOptionPane.showInputDialog("Input the amount of money you want to remove");
                 int time = Integer.parseInt(timeS);
                 Atm1.interest(rate, time);
             }
             if(choice.equals("4")){
                 //display current balance
                 Atm1.display();
             }
             if(choice.equals("5")){
                 //close program
                 System.exit(0);
             }
                
    }
    
}
}