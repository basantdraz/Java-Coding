// Find the average of each student's test scores

import java.util.Scanner;

public class FinalGrade{
    public static void main(String[] args) {
        
        int numOfstudents = 25;
        int numOftests = 4;
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < numOfstudents; i++) {
            System.out.println("Scores of Student number #" + (i+1));
            double total=0;
            for (int j =0; j<numOftests; j++){
                System.out.print("Enter the score of test number " + (j+1) +": ");
                double score = scanner.nextDouble();
                total =total+score;
            }
            double avg = total/numOftests;
            System.out.println("The finel grade of Student #" + (i+1) + " is " + avg + "%");
        }
        scanner.close();
    }

}