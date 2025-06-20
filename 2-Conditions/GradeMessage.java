import java.util.Scanner;

public class GradeMessage{
    public static void main(String[] args) {
        //Get the Letter grade
        System.out.print("Enter your Grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        //Determine the Displayed Message
        String message;
        switch (grade) {
            case "A":
                message = "WOW.. Excellent Jop";
                break;
                case "B":
                message = "Great Jop!";
                break;
                case "C":
                message="Good Jop!";
                break;
                case "D":
                message = "Mmmm You to work aa bit harder";
                break;
                case "F":
                message = "Uh Oh .. :(";
                break;
            default:
                message = "ERROR .. Invalid Grade";
        }

        System.out.println(message);

    }
}