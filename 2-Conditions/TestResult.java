import java.util.Scanner;

public class TestResult{
    public static void main(String[] args) {
        //Get the Score os test
        System.out.print("Enter Your test scor: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;
        if(score < 50){
            grade = 'F';
        }
        else if(score <65){
            grade = 'D';
        }
         else if(score <75){
            grade = 'E';
        }
        else if(score <85){
            grade = 'C';
        }
        else if(score <90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your Grade is: " + grade);
    }
}