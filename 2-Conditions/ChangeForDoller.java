//Make a game — the objective of the game is to enter enough change to equal exactly one dollar.

import java.util.Scanner;

public class ChangeForDoller{
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome To CHANGE FOR A DOLLER!");
        System.out.println("Your goal to enter enough chane to make excatly ONE doller");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Pennies: ");
        int numOfPennies = scanner.nextInt();

        System.out.print("Enter the number of Nickels: ");
        int numOfnickels = scanner.nextInt();

        System.out.print("Enter the number of Dimes: ");
        int numOfdimes = scanner.nextInt();

        System.out.print("Enter the number of Quarters: ");
        int numOfquarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies* penny + numOfdimes*dime + numOfnickels*nickel + numOfquarters*quarter;

        if(total>dollar){
            double amountOver = total - dollar;

            System.out.println("Uh Oh!\nSorry, you lose!\nYour were over " + String.format("%.2f", amountOver) + "Cents");
        }
        
        else if(total<dollar){
            double amountShort = dollar - total;

            System.out.println("Uh Oh!\nSorry, you lose!\nYour were short " + String.format("%.2f", amountShort) + "Cents");
        }

        else {
            System.out.println("Congrats! this is excatly 1$\nYOU WIN!!");
        }

    }
}

