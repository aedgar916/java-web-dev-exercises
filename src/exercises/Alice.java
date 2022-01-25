package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceSentence = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search for: ");
        String searchTerm = input.nextLine();
        Boolean wasFound = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        System.out.println(searchTerm + " was found in the sentence? " + wasFound);
        System.out.println("The index of your word is: " + aliceSentence.indexOf(searchTerm));
        System.out.println("The length of your word is: " + searchTerm.length());

        String newSentence = aliceSentence.replace(searchTerm,"");
        System.out.println(newSentence);
    }
}
