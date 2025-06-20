package person;

public class Employee extends Person{
    private int id;
    private String title;

    public Employee(){
        System.out.println("In Employee default constructor");
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }
}