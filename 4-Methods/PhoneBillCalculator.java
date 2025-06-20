/*
 * This program calculates a cellphone bill.
 * It asks the user for the plan fee and the number of overage minutes.
 * The program charges 25 cents for every overage minute,
 * then applies a 15% tax on the subtotal.
 * Separate methods are used to calculate the tax,
 * the overage fees, and the final total which is then printed.
 */
import java.util.Scanner;

public class PhoneBillCalculator{

public static void main(String[] args) {

//Get user plan fee and ovarage minutes
Scanner scanner = new Scanner(System.in);
System.out.print("Enter base cost of your plan:"); 
double baseCost = scanner.nextDouble();

System.out.print("Enter overage minutes:"); 
double ovarageMinutes = scanner.nextDouble();

scanner.close();

double extraMin = ovarage(ovarageMinutes);
double tax = calculateTax(extraMin + baseCost);

finalBill(baseCost, extraMin, tax);
}

//Method to calculate overage fee
public static double ovarage(double ovarageMinutes){
double rate =0.25;
double overageFee = rate * ovarageMinutes;
return overageFee;
}

//Method to calculate tax
public static double calculateTax(double subtotal){
double rate = 0.15;
double tax = rate * subtotal;
return tax;
}

//Method to Calculate final bill and display final result
public static void finalBill(double base, double overage, double tax){
double total = base + overage + tax;

 System.out.println("Phone Bill Statement");
 System.out.println("Plan: $" + String.format("%.2f", base));
 System.out.println("Overage: $" + String.format("%.2f", overage));
 System.out.println("Tax: $" + String.format("%.2f", tax));
 System.out.println("Total: $" + String.format("%.2f", total));
}

}