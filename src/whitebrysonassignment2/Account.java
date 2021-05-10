/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitebrysonassignment2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brysonwhite
 */
public class Account {
    Scanner input = new Scanner (System.in);
    private double balance;
    private int accountID = 1;
    private String accountType;
    private int nextID;

    /**
     * Gets balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * gets Account id
     * @return account id
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * gets account type
     * @return account type
     */
    public String getAccountType() {
        return accountType;
    }
    
    /**
     * sets account type
     * @param accountType type of account
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * sets balance
     * @param balance balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * sets account ID
     * @param accountID account ID
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    
    /**
     * Increments account ID when created
     * @return incremented ID
     */
    public int  incrementNextID(){
        return accountID++;
    }

    /**
     * gets next ID after incremented
     * @return
     */
    public int getNextID() {
        return nextID;
    }
    
    /**
     * adds money to checking account after checking if it is the right id and account type
     * @param accounts list of customer accounts
     * @param ID account ID
     * @param type type of account 
     * @return true or false
     */
    public boolean addCheckingMoney(ArrayList<Account> accounts, int ID, String type){
        double add;
        boolean b;
        boolean b2;

        for (Account a: accounts){
            b = a.hasID(accounts, ID, a);
            b2 =a.isAccountType(accounts, type, a);

            if (b){
                if (b2){
                    System.out.println("How much money would you like to add? ");
                    add = input.nextDouble();
        
                        //add money to current balance
                    a.setBalance(a.getBalance() + add);
                    System.out.println("Your new balance is: " + a.getBalance());
                    return true;
                    
                }
            }
        }
        return false;
    }
    
    /**
     * takes money from checking account after checking if it is the right id and account type
     * @param accounts list of accounts
     * @param ID account ID
     * @param type type of account
     * @return true or false
     */
    public boolean withdrawCheckingMoney(ArrayList<Account> accounts, int ID, String type){
        double withdraw;
        boolean b;
        boolean b2;
        for (Account a : accounts){
            b = a.hasID(accounts, ID, a);
            b2 = a.isAccountType(accounts, type, a);
            if (b){
                if (b2){
                    System.out.println("How much money would you like to withdraw? ");
                    withdraw = input.nextDouble();
                    //take money from current balance
                    a.setBalance(a.getBalance() - withdraw);
                    System.out.println("Your new balance is: " + a.getBalance());
                    return true;
                    
                }
            }
        }
        return false;

    }
    
    /**
     * Transfers money from checking account to Savings account
     * @param accounts list of customer's accounts
     * @param checking checking account type
     * @param saving saving account type
     * @param cID checking account ID
     * @param sID saving account ID
     * @return true or false
     */
    public boolean transferToSavings(ArrayList<Account> accounts, String checking, String saving, int cID, int sID){
        double amount;
        boolean checkingID;
        boolean savingID;
        boolean isChecking;
        boolean isSaving;
        for (Account c : accounts){
            checkingID = c.hasID(accounts, cID, c);
            isChecking = c.isAccountType(accounts, checking, c);
            if (checkingID){
                if (isChecking){
                    for (Account s : accounts){
                        if (s.hasID(accounts, sID, s)){
                            if (s.isAccountType(accounts, saving, s)){
                                System.out.println("How much money would you like to transfer? ");
                                        amount = input.nextDouble();
                                        s.setBalance(s.getBalance() + amount);
                                        c.setBalance(c.getBalance() - amount);
                                        System.out.println("Your new checking balance is: $" + c.getBalance());
                                        System.out.println("Your new saving balance is $" + s.getBalance());
                                        return true;
                               
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * Checks to see if account is of certain type
     * @param accounts list of customer accounts
     * @param type account type
     * @param a specific account
     * @return true or false
     */
    public boolean isAccountType(ArrayList<Account> accounts, String type, Account a){

            if (a.getAccountType() == type){
                return true;
            }
        
        return false;
    }
    
    /**
     * Checks to see if an account has the same ID as user input
     * @param accounts list of customer accounts
     * @param ID account ID
     * @param a Account 
     * @return true or false
     */
    public boolean hasID(ArrayList<Account> accounts, int ID, Account a){

            if (a.getAccountID() == ID){
                return true;
            }

        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
