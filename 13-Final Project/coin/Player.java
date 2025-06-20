package coin;

public class Player {

    private String name;
    private String guess;

    public Player (String name){
        setName(name);
    }

    public String getName(){
        return name;
    }
    public String getGuess(){
        return guess;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGuess(String guess){
        this.guess = guess;
    }

}