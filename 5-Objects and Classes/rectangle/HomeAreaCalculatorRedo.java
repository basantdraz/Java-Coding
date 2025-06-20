package rectangle;
import java.util.Scanner;

public class HomeAreaCalculatorRedo{
private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
      Rectangle kitchen = calculator.getRoom();
      Rectangle bathroom = calculator.getRoom();

      double totalArea = calculator.calculateTotalArea(kitchen, bathroom); 
      System.out.println("The total Area is: " + totalArea);

      calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the Length of the room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}