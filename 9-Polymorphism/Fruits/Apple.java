package fruits;

public class Apple extends Fruits {

    public Apple(){
        setCalories(95);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is my favorite 🥃");
    }
}