/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitebrysonassignment2;

/**
 *
 * @author brysonwhite
 */
public class Saving extends Account {

    /**
     * Initializes Saving and Account fields
     * @param ID Account ID
     * @param amount starting balance amount
     */
    public Saving (int ID, double amount){
        super.setBalance(amount);
        super.setAccountType("Saving");
        super.setAccountID(ID);
    }




 
}
