package bills;

public class PhoneBill {

    //Attributes
    private int id;
    private double baseCost;
    private int allottedMins;
    private int usedMins;

    //Constructors
    public PhoneBill(){
        id = 0;
        baseCost = 100;
        allottedMins = 850;
        usedMins = 900;
    }
    public PhoneBill(int id){
        this.id = id;
        baseCost = 100;
        allottedMins = 850;
        usedMins = 900;
    }
    public PhoneBill(int id, double baseCost, int allottedMins, int usedMins){
    this.id = id;
    this.baseCost = baseCost;
    this.allottedMins = allottedMins;
    this.usedMins = usedMins;
    }

    //Getters
    public int getId(){
        return id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public int getAllottedMins(){
        return allottedMins;
    }
    public int getUsedMins(){
        return usedMins;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public void setAllottedMins(int allottedMins){
        this.allottedMins = allottedMins;
    }
    public void setUsedMins(int usedMins){
        this.usedMins = usedMins;
    }

    //Methods

    public void setMinutesUsed(int minutes){
        usedMins = minutes;
    }
     public double calculateOvarage(){

        if (usedMins <= allottedMins){
            return 0;
        }
        double overageRate = 0.25;
        int overageMins = usedMins - allottedMins;
        return (overageMins * overageRate);
     }

     public double calculateTotalCost(){
        // Calculate Tax
        double tax = 0.15;
        double totaTax = tax * (baseCost + calculateOvarage());

        //Total cost
        double totalCost = baseCost + totaTax + calculateOvarage();

        return totalCost;
     }

     public void printItemizedBill(){
        System.out.println("ID:  " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOvarage())); 
         System.out.println("Total: $" + String.format("%.2f", calculateTotalCost()));
     }

}