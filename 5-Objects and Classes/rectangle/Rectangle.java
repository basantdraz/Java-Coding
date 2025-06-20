package rectangle;

 public class Rectangle {

    private double length;
    private double width;

    //Getters
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    //Setters
    public void setLength(double length){
        this.length= length;
    }
     public void setWidth(double width){
        this.width = width;
    }

    //Constructors
     public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    //Methods for rectangle calculations
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
 }