/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitebrysonassignment2;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author brysonwhite
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int nextID;
        Account account = new Account();

        int choice = 0;
        
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Welcome!");
        //ask user if they are customer or employee
        boolean error = true;
        System.out.println("Are you a (1)customer or (2)employee?");
        while(error){
        try{
        choice = input.nextInt();
        if (choice <1 || choice > 2){
            throw new Exception();
        }
        error = false;
        }

        catch(InputMismatchException ime){
            System.out.println("Please enter a number. ");
            input.next();
        }
        catch(Exception e){
            System.out.println("Please enter a 1 or a 2. ");
        }
        
        }
        
        //if user is customer
        if (choice == 1){
            System.out.println("Please enter the following: ");
            System.out.println("First Name: ");
            String name = input.next();
            System.out.println("User ID: ");
            int id = input.nextInt();
            System.out.println("Phone Number: ");
            String phone = input.next();
            Customer customer = new Customer(name, id, phone);
            int choice2 = 0;
           
            
            while(choice2 != 7){
                System.out.println("\nSelect one of the following programs: \n");
                    System.out.println("1. Open an account\n"
                    + "2. Close an account\n"
                    + "3. View all accounts\n"
                    + "4. Deposit\n"
                    + "5. Withdraw\n"
                    + "6. Transfer money to savings\n"
                    + "7. Quit\n");
            
            choice2 = input.nextInt();
            switch (choice2){
                case 1:
                System.out.println("Which type of account to open? \n"
                        + "1. Checking\n"
                        + "2. Saving\n"
                        + "3. CD\n");
                int accountChoice = input.nextInt();
                
                if (accountChoice == 1){
                    customer.incrementNextID();
                    int ID = customer.getNextID();
                    customer.openAccount(new Checking(ID));
                    
                }        
                if (accountChoice == 2){
                    System.out.println("Do you have a checking account? (1)yes (2)no ");
                    int checkAccount = input.nextInt();
                    if (checkAccount == 2){
                        System.out.println("You must have a checking account to open a saving account. ");
                    }
                    if (checkAccount == 1){
                        System.out.println("How much will you start out with? ");
                        double amount = input.nextDouble();
                        customer.incrementNextID();
                        int ID = customer.getNextID();
                    customer.openAccount(new Saving(ID, amount));
                    
                    }
                }
                if (accountChoice == 3){
                    System.out.println("NOTE: You will not be able to edit CD account once created.\n How much money do you wish to put in? \n  ");
                    double balance = input.nextDouble();
                    System.out.println("How many years do you wish to lock this account? ");
                    int years = input.nextInt();
                    customer.incrementNextID();
                    int ID = customer.getNextID();
                    customer.openAccount(new CD(balance,years, ID));
                    
                }
            
                    break;
                case 2:
                System.out.println("Which account would you like to close? ");
                customer.viewAllAccounts();
                System.out.println("Enter the account number: ");
                int inputID = input.nextInt();
                boolean closeAccount = customer.closeAccount(inputID);
                if (closeAccount){
                    System.out.println("You have closed your account. ");
                }
                else{
                    System.out.println("Sorry, we cannot find an account with that number. ");
                }

                
                    break;
            
                case 3:
                    System.out.println(customer.getName() + "'s Accounts");
                customer.viewAllAccounts();
                    break;
            
                case 4:
                    System.out.println("Which account would you like to add money to? ");
                    customer.viewAllAccounts();
                    System.out.println("Enter the CHECKING account number: ");
                    int ID = input.nextInt();
                        boolean addMoney = account.addCheckingMoney(customer.accounts, ID, "Checking");
                        if (!addMoney){
                            System.out.println("Make sure the number is correct and the account is a CHECKING.");
                        }

                    break;
                
                case 5:
                    System.out.println("Which account would you like to withrdaw from? ");
                    customer.viewAllAccounts();
                    System.out.println("Enter the CHECKING account number: ");
                    int ID2 = input.nextInt();
                        boolean takeMoney = account.withdrawCheckingMoney(customer.accounts, ID2, "Checking");
                        if (!takeMoney){
                            System.out.println("Make sure the number is correct and the account is a CHECKING.");
                        }

                    break;
                    
                case 6:
                    customer.viewAllAccounts();
                    System.out.println("Enter the CHECKING account number: ");
                    int cID = input.nextInt();
                    System.out.println("Enter the SAVING account number: ");
                    int sID = input.nextInt();
                        boolean transferMoney = account.transferToSavings(customer.accounts, "Checking", "Saving", cID, sID);
                        if(!transferMoney){
                            System.out.println("Make sure the number is correct and you chose a SAVING and CHECKING accounts. ");
                    
                        


                        
                        
                    }
                    break;
                case 7: 
                    System.out.println("Goodbye");
                    break;
            
                default:System.out.println("Enter a 1, 2, 3, 4, 5, 6, or 7");
                
                
            }

            }
            
            
        }
        

        //if user is employee
        if (choice == 2){
            System.out.println("Please enter the following: ");
            System.out.println("First Name: ");
            String name = input.next();
            System.out.println("User ID: ");
            int id = input.nextInt();
            System.out.println("Phone Number: ");
            String phone = input.next();
            System.out.println("Hourly Salary: ");
            double salary = input.nextDouble();
            Employee employee = new Employee(name, id, phone, salary);
            int choice2 = 0;
            
            while(choice2 != 5){
            System.out.println("Select one of the following programs: \n"
                    + "1. View info\n"
                    + "2. Enter hours\n"
                    + "3. Calculate week pay\n"
                    + "4. Overtime pay\n"
                    + "5. Quit\n");
            choice2 = input.nextInt();
            
            switch(choice2){
                case 1:
                    employee.viewInfo();
                    break;
                    
                case 2:
                    System.out.println("Enter the amount of hours you worked this week");
                    int hours = input.nextInt();
                    employee.setHoursWorked(hours);
                    
                    break;
                    
                case 3:
                    double pay = employee.calculatePay(employee.gethoursWorked());
                    System.out.println("Your weekly pay is: $" + pay);
                    
                    break;
                
                case 4:
                    System.out.println("Enter the amount of overtime hours. Your new pay will be calculated at the end. ");
                    int overtime = input.nextInt();
                    double newPay = employee.calculatePay(employee.gethoursWorked()) + employee.calculateOvertimePay(overtime);
                    System.out.println("Your total pay is: $" + newPay);
                    
                    break;
                    
                case 5: 
                    System.out.println("Goodbye");
                    break;
                    
                default: System.out.println("Enter a 1, 2, 3, 4, or 5. ");
                
                
                
            }
            
            

            }
        }
        
        

    }
    
}
