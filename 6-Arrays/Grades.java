import java.util.Scanner;

public class Grades{

    private static Scanner scanner = new Scanner(System.in);
    private static int grades[];

    public static void main(String[] args) {
        System.out.println("How many Grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter Grade #" + (i+1) + ":  ");
            grades[i] = scanner.nextInt();  
        }
    }

    public static double calculateAverage(){
        double sum = 0;
        for (int grade : grades) {
            sum = sum + grade; 
        }

        double avg = sum / grades.length;
        return avg;
    }

    public static int getHighest(){
        int highest = grades[0];

        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return  highest;
    }

    public static int getLowest(){
        int lowest = grades[0];

        for (int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return  lowest;
    }
 
}