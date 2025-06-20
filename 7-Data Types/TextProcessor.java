public class TextProcessor{

    public static void main(String[] args) {

        countWords("Software testing Engineer");
        reverseString("Hello SW World");
        addSpaces("HelloSoftwareWorld!");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * */

    public static void countWords(String text){

        var words = text.split(" ");
        int numOfwords = words.length;

        String message = String.format("Words counts (%d) words", numOfwords);
        System.out.println(message);

        for (int i = 0; i < numOfwords; i++) {
            System.out.println(words[i]); 
        }
    }

    //Print a string in reverse order

    public static void reverseString(String text){
        for (int i = text.length()-1; i >= 0; i--) {
             
             System.out.print(text.charAt(i));
        }
        System.out.println("");
    }

    //Adds spaces before each uppercase letter

    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {

            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
            
        }
                System.out.println(modifiedText);

    }

}