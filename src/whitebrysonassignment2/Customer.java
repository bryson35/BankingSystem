/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitebrysonassignment2;

import java.util.ArrayList;

/**
 *
 * @author brysonwhite
 */
public class Customer extends Person {

    /**
     *
     */
    public ArrayList<Account> accounts;
    private int nextID;
    
    /**
     * Initialize Customer and Person fields
     * @param name name
     * @param userID ID
     * @param phoneNumber phone number
     */
    public Customer (String name, int userID, String phoneNumber){
        super.setName(name);
        super.setUserID(userID);
        super.setPhoneNumber(phoneNumber);

        accounts = new ArrayList<Account>();
    }
    
    /**
     * Opens an account and adds it to customer accounts
     * @param account Account
     */
    public void openAccount(Account account){
        accounts.add(account);
        account.incrementNextID();
    }
    
    /**
     * Closes account and removes it from customer account list
     * @param ID account ID
     * @return true or false
     */
    public boolean closeAccount(int ID){
        for (Account a : accounts){
            if (a.getAccountID() == ID){
        accounts.remove(a);
        return true;
            }
        }
        return false;
    }
    
    /**
     * Displays all customer's accounts
     */
    public void viewAllAccounts(){
        for (Account a : accounts)
        System.out.println("Type: " + a.getAccountType() + ", Account #: " + a.getAccountID() + ", Balance: $" + a.getBalance());
    }

    /**
     * gets nextID
     * @return next ID
     */
    public int getNextID() {
        return nextID;
    }
    

    /**
     * sets nextID
     * @param nextID next ID
     */
    public void setNextID(int nextID) {
        this.nextID = nextID;
    }
    
    /**
     * Increments ID
     * @return incremented ID
     */
    public int  incrementNextID(){
        return nextID++;
    }
    
    
    
    
    
}
