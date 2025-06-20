import java.util.Scanner;

public class AddNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do { 

        System.out.print("Please enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter second number: ");
        double num2 = scanner.nextDouble();

            
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);   

            System.out.println("Do you want to do it again?\nPlease enter true or false");
            again =scanner.nextBoolean();

            } while (again);
        
        scanner.close();
    }  
}