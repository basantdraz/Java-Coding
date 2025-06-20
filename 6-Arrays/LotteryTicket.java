import java.util.Arrays;
import java.util.Random;

public class LotteryTicket{

    private static final int LENGTH =6;
    private static final int MAX_NUM =69;


    public static void main(String[] args) {

        int ticket[] = generateNum();
        Arrays.sort(ticket);
        printTicket(ticket);
        
    }

    public static int[] generateNum(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNm;

            do { 
                randomNm = random.nextInt(MAX_NUM)+1; 

            } while (search(ticket, randomNm));

            ticket[i] = randomNm;
        }

        return ticket;
    }
/**
 *  Does a sequential search on the array to find a value
 * @param array Array to search through 
 * @param numToSearch Value to search
 * @return true if found, false if not
 */

    public static boolean search(int[] array, int numToSearch){

        for (int value : array){
            if (value == numToSearch){
                return true;
            }
        }
        return false;
    }
    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] +" | ");
        }
    }

}


