import  java.util.Scanner;

public class DayOfTheweek{

    public static void main(String[] args) {
      String day[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"} ;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter a number for a day of the week: ");
      int numOfday = scanner.nextInt();

      System.out.println("Corresponding Day is:  " + day[numOfday-1]);
    }
}