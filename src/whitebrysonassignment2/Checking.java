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
public class Checking extends Account {

    /**
     * Initializes Checking and Account fields
     * @param ID account ID
     */
    public Checking(int ID){
        super.setBalance(25);
        super.setAccountID(ID);
        super.setAccountType("Checking");
    }

    
    

    
    
}
