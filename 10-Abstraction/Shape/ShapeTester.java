package shape;

public class ShapeTester{

    public static void main(String[] args){

        Shape rectangle = new Rectangle(4, 6);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}