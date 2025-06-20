package fruits;

public class Banana extends Fruits {

    public Banana(){
        setCalories(105);
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is gross 🥴");
    }
}