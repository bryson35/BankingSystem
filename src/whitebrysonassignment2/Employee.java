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
public class Employee extends Person {
    private double hourlySalary;
    private  int hoursWorked;
    private int overtimeHours;
    public ArrayList<Customer> customers;
    
    /**
     * Initializes Employee and Person fields
     * @param name employee name
     * @param userID employee ID
     * @param phoneNumber employee phone number
     * @param hourlySalary hourly salary
     */
    public Employee(String name, int userID, String phoneNumber, double hourlySalary){
        super.setName(name);
        super.setUserID(userID);
        super.setPhoneNumber(phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    /**
     * gets overtime hours
     * @return overtime hours
     */
    public int getOvertimeHours() {
        return overtimeHours;
    }
    
    /**
     * gets hourly salary
     * @return hourly salary
     */
    public double getHourlySalary() {
        return hourlySalary;
    }

    /**
     * gets hours worked
     * @return hours worked
     */
    public int gethoursWorked() {
        return hoursWorked;
    }

    /**
     * sets hourly salary
     * @param salary hourly salary
     */
    public void setHourlySalary(double salary) {
        this.hourlySalary = salary;
    }

    /**
     * sets hours worked
     * @param hoursWorked hours worked for a week
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * sets overtime hours
     * @param overtimeHours overtime hours
     */
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
    /**
     *Displays employee information
     */
    public void viewInfo(){
        System.out.println("Name: " + super.getName()+ ", ID: " + super.getUserID() + ", Phone: " + super.getPhoneNumber() + " Hourly Salary: $" + getHourlySalary());
    }
    
    /**
     * calculates weekly pay
     * @param hours hours worked
     * @return weekly pay
     */
    public double calculatePay(int hours){
        double pay = hours*getHourlySalary();
        return pay;
    }
    
    /**
     * calculates overtime pay
     * @param overtimeHours overtime hours
     * @return overtime pay
     */
    public double calculateOvertimePay(int overtimeHours){
        double salary = getHourlySalary()*1.5;
        double overtimePay = overtimeHours * salary;
        return overtimePay;
    }
    
    
    

    
   
    
    
        
}
