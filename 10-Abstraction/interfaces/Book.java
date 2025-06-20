package interfaces;

public class Book implements Product{
    private double price;
    private String name;
    private String color;
    private String author;
    private int page;

    @Override
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getAuthor(){
        return author;
    }

    public void setPage(int page){
        this.page = page;
    }
}