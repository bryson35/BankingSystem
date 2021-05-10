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
public class Person {
    private String name;
    private int userID;
    private String phoneNumber;

    /**
     * gets name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets user ID
     * @return ID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * gets phone number
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
    

    /**
     * sets user ID
     * @param userID user ID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * sets phone number
     * @param phoneNumber phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
}
