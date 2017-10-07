/*
 * Description of licence.

 */
package atmProgram;

import java.util.Scanner;

/**
 *
 * @author makena
 */
public class AtmProgram {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    private static int balance;
    private static int depositCount = 0;
    private static int dailyDepositAmount = 0;
    private static int dailyWithdrawalAmount = 0;
    private static int withdrawalCount = 0;

    public AtmProgram(int balance) {
        AtmProgram.balance = balance;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
           /*
                Instanciate the AtmProgram with a balance of 50000.                
                */
        AtmProgram one = new AtmProgram(50000);
        startProgram();

    }

    public static void startProgram() {
           /*
                Start by prompting the user to enter an action.                
                */

        System.out.println("What would you like to do? 1.) Query Balance \t 2.) Deposit \t 3.) Withdraw  \t 4.) Quit \t");
        System.out.println("-----------------------------------");

        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Your balance is:: " + getBalance());
                startProgram();

                break;
            case "2":
                   /*
                Checks that the deposit count in the day does not exceed 4.                
                */
                if (getDepositCount() >= 4) {
                    System.out.println("Sorry, max deposit number of time is 4 ");
                    startProgram();
                }
               /*
                Set deposit amount and prompt user to enter amount.                
                */
                setDepositCount();
                System.out.println("Enter the amount you want to deposit: ");
                int amount = Integer.parseInt(sc.nextLine());
                if (amount > 40000) {
                    System.out.println("Sorry, max deposit is 40000. Try again. ");
                    startProgram();

                }
                /*
                Checks that the amount deposited is not less than 1.                
                 */
                if (amount < 1) {
                    System.out.println("Sorry, min deposit is 1. Try again. ");
                    startProgram();

                }
                /*
                Checks that the total amount deposited for the day is not greater than 150000.                
                 */
                if (getDailyDepositAmount() > 150000 || ((getDailyDepositAmount() + amount) > 150000)) {
                    System.out.println("Sorry, total maximum deposit allowed in a day is 150000. Try again. ");
                    startProgram();

                }
                /*
                Make the deposit.                
                 */
                setDeposit(amount);
                setDailyDepositAmount(amount);
                System.out.println("Great, your new balance is: " + getBalance());
                System.out.println("Total deposit for today is: " + getDailyDepositAmount() + ". No of times deposited today::  " + getDepositCount());

                startProgram();

                break;
            case "3":
                /*
                Checks that the maximum withdrawal count for the day does not exceed 3.                
                 */

                if (getWithdrawalCount() >= 3) {
                    System.out.println("Sorry, max withdrawal number of time is 3. Taking you to the menu");
                    startProgram();
                }

                /*
               Get amount to withdraw.                
                 */
                System.out.println("Enter the amount you want to withdraw: ");
                int amt = Integer.parseInt(sc.nextLine());
                if (amt > 20000) {
                    System.out.println("Sorry, You cannot withdraw more than 20000 per transaction. Try again. ");
                    startProgram();

                }
                /*
                Checks that the amount to withdraw is not less than 1.                
                 */
                if (amt < 1) {
                    System.out.println("Sorry, min withdrawal is 1. Try again. ");
                    startProgram();

                }
                /*
                Checks that the amount to withdraw in the day is not greater than 50000.                
                 */
                if (getDailyWithdrawalAmount() > 50000) {
                    System.out.println("Sorry, total maximum deposit allowed in a day is 150000. Try again. ");
                    startProgram();

                }
                /*
                Checks that the amount to withdraw is not larger than amount in the account.                
                 */
                if (getBalance() < amt) {
                    System.out.println("Sorry, you cannot withdraw ore than what is in you account. You have: " + getBalance() + ". Try again. ");
                    startProgram();

                }

                /*
                Make the withdrawal.                
                 */
                setWithdrawalCount();
                setDailyWithdrawalAmount(amt);
                makeWithdrawal(amt);

                System.out.println("Success, Your new balance is. " + getBalance());
                System.out.println("Total withdrawal for today is: " + getDailyWithdrawalAmount() + ". No of times withdrawn today::  " + getWithdrawalCount());

                startProgram();

                break;
            case "4":

                /*
                Checks that the user actually wants to quit.                
                 */
                System.out.println("Are you sure you would like to quit? \t. Enter n to return to menu or any character to exit.");

                String ch = sc.nextLine();
                if (ch.equals("n") || ch.equals("no")) {
                    startProgram();

                } else {
                    System.out.println("Thanks, bye.. ");

                    break;
                }

                break;
            default:

                /*
                Checks that an invalid input is handled.                
                 */
                System.out.println("Invalid choice:: Please try again: ");
                startProgram();

                break;
        }

    }

    /*
                These are the getter and setter methods for the program.                
     */
    public static int getBalance() {
        return balance;
    }

    public static void setDeposit(int amount) {

        AtmProgram.balance = amount + balance;

    }

    public static int getDepositCount() {
        return depositCount;
    }

    public static void setDepositCount() {
        depositCount += 1;

    }

    public static void setDailyDepositAmount(int amount) {
        dailyDepositAmount += amount;
    }

    public static int getDailyDepositAmount() {
        return dailyDepositAmount;
    }

    public static int getDailyWithdrawalAmount() {
        return dailyWithdrawalAmount;
    }

    public static void setDailyWithdrawalAmount(int amount) {
        dailyWithdrawalAmount += amount;

    }

    public static void setWithdrawalCount() {
        withdrawalCount += 1;
    }

    public static int getWithdrawalCount() {
        return withdrawalCount;
    }

    private static void makeWithdrawal(int amount) {
        balance -= amount;
    }

}
