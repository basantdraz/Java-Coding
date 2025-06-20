/*
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

// Declare static global variables
    static double salaryReqiured = 25000;
    static int creditReqiured = 700;
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        //Get user salary and credit score
        double userSalary = getSalary();
        int userCredit = getCredit();

        scanner.close();

        //Check if user is qualified
        boolean qualified = isQualified(userSalary, userCredit);

        //Notify the user
        notifyUser(qualified);  
    }

//Methed to Get user salary
    public static double getSalary(){
        System.out.print("Enter Your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

//Methed to Get User credit score
    public static int getCredit(){
      System.out.print("Enter Your Credit score: ");
        int credit = scanner.nextInt();
        return credit;  
    }


//Methed to Check if user has required salary and credit score
    public static boolean isQualified(double salary, int credit){
        if (salary >= salaryReqiured && credit >= creditReqiured){
            return true;
        }
        else{
            return false;
        }
    }

//Methed to display final result of user
    public static void notifyUser(boolean isUserQualified){
        if(isUserQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }

}