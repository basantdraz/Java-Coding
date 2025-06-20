import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling{

    public static void main(String[] args) {
        createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    //Same as createNewFile but throws the exception instead of handling it here
    public static void createNewFileRethrow() throws IOException{
    File file = new File("resources/nonexistent.txt");
    file.createNewFile();
    }

    //Reads numbers from a file with multiple exception types handled
    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");

        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            double num = fileReader.nextDouble();
            System.out.println(num);
        }

        catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

        finally{

            // Always executed whether exception occurred or not
            // Ensures Scanner is closed (to avoid memory/resource leaks)
               if(fileReader != null)
                fileReader.close();
        }
    }

    //Same as above, but uses try-with-resources to automatically close the Scanner
    public static void tryWithResources(){
        File file = new File("resources/numbers.txt");

        // Try-with-resources automatically closes fileReader at the end of the block
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            // Catches file not found OR invalid input data (e.g. strings instead of numbers)
            e.printStackTrace();
        }
    }
}