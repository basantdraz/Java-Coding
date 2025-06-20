package person;

public class Person{

    private String name;
    private int age;
    private String gender;

    //Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    //Setters
    public void  setName(String name){
       this.name = name;
    }

    public void  setAge(int age){
       this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}