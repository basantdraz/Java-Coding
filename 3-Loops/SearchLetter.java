//Searching if the word contains "A" letter

import java.util.Scanner;

public class SearchLetter{
    public static void main(String[] args) {
        
        System.out.println("Enter a Word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if(letter == 'A'|| letter== 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
         System.out.println("Word " + word + " Contains 'A' letter" );
        }
        else{
         System.out.println("Word " + word + " doesn't Contains 'A' letter" );

        }

    }
}