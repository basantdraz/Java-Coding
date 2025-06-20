
import java.util.Scanner;

/*
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
* For those who do, they receive a congratulatory message.
* For those who don’t, they are informed of how many sales they were short.
*/

public class SalaryCalculator{
    public static void main(String[] args) {
        //Initialize known values
        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("How many sales did employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales>=10){

            System.out.println("Congrats! You've met your quota");
            salary = salary + bonus;
        }
        else{
            int salesShort = 10 - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short");
        }

        //Output
        System.out.println("The employee's pay is: " + salary);

    }
}