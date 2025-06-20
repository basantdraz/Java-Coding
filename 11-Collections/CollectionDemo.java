import java.util.*;

public class CollectionDemo{

    public static void main(String[] args){
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    //Set: Does NOT allow duplicates, and does NOT maintain insertion order

     public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon"); // Duplicate - will be ignored

        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]
    }

    //List: Allows duplicates and maintains insertion order
    public static void listDemo(){
        List fruit = new ArrayList(); 
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon"); // Duplicate - allowed

        System.out.println(fruit.get(1));
        System.out.println(fruit.size()); //5
        System.out.println(fruit);
    }

    //Queue: Follows FIFO (First In, First Out) principle
    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // Order reflects insertion

        fruit.remove();  // Removes the first element ("apple")
         System.out.println(fruit);
         System.out.println(fruit.peek()); // Shows the head of the queue ("lemon") without removing it
    }

    //Map: Stores key-value pairs. Keys must be unique, values can be duplicated
    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);     // (Key, Value)
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);     // Overwrites the previous value for "lemon"

        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, lemon=17}
        System.out.println(fruitCalories.entrySet());   // Prints all key-value pairs

        fruitCalories.remove("orange"); // Removes the entry with key "orange"
        System.out.println(fruitCalories); // Remaining entries
    }   

     //Print method for any Collection (List, Set, etc...)
    public void print(Collection<String> collection){
        // Using an Iterator
        var i = collection.iterator();     
        while(i.hasNext()){
            System.out.println(i.next());
        }
        // Using for-each loop
        for(String item : collection){     
            System.out.println(item);
        }
        // Using lambda expression
        collection.forEach(System.out::println); 
    }

     //Print method for a Map
    public void print(Map<String, Integer> map){
        // Using for-each loop
        for(var entry : map.entrySet()){   
            System.out.println(entry.getValue());
        }
        // Using lambda
        map.forEach(
            (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v)); 
    }
}