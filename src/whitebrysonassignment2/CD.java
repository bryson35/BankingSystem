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
public class CD extends Account {
    private int maturityYears;
    private double interestRate;
    
    /**
     * Initializes CD and Account fields
     * @param balance account balance
     * @param years maturity years
     * @param ID account ID
     */
    public CD(double balance, int years, int ID){
        super.setBalance(balance);
        this.maturityYears = years;
        this.interestRate = .02;
        super.setAccountType("CD");
        super.setAccountID(ID);
    }

    /**
     * gets maturityYears
     * @return maturity years
     */
    public int getMaturityYears() {
        return maturityYears;
    }

    /**
     * gets interest rate
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * sets maturity years
     * @param maturityYears maturity years
     */
    public void setMaturityYears(int maturityYears) {
        this.maturityYears = maturityYears;
    }

    /**
     * sets interest rate
     * @param interestRate interest rate 
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
   
    
}
