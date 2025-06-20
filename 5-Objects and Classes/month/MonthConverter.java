package month;

public class MonthConverter{

    public static void main(String[] args) {

        //Valid data
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("April"));  

        //invalid data
        System.out.println(Month.getMonth(15));
        System.out.println(Month.getMonth("Ap"));
    }
}