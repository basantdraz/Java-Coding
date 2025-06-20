//This package is intended to demonstrate overriding and overloading

package rectangle;

public class Rectangle{

    protected  double  length;
    protected  double  width;
    protected  double  sides =4;

    //Getters
    public double  getLength(){
        return length;
    }

    public double  getWidth(){
        return width;
    }

    public double  getSides(){
        return sides;
    }

    //Setters
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setSides(double sides){
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }

}