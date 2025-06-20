package shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public double getLegth(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLegth(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLegth(length);
        setWidth(width);
    }

    @Override

    double calculateArea(){
        return (length * width);
    }

}