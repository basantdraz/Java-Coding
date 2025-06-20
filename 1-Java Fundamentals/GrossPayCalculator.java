import java.util.Scanner;

public class GrossPayCalculator{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

// Get the number of hours the employee works
    System.out.print("Enter the number of hours the employee works: ");
    int hours = scanner.nextInt();

// Get the Hourly pay rate
    System.out.print("Enter the employee's pay rate: ");
    double payRate = scanner.nextDouble();

    scanner.close();

//Multiply hours and pay rate
    double grossRate = hours * payRate;

// Display result
    System.out.println("The employee's Gross rate is: " + grossRate);

    }
}