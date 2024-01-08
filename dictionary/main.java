import java.util.*;

public class main {
    public static void main(String[] args){
        myWordsDictionary dictionary = new myWordsDictionary();
        String[] sampleWords = {"apple", "banana", "avocado", "ball", "cat", "dog", "elephant"};

        // Add words to the dictionary
        dictionary.insertWord(sampleWords);

        // Print all letters and corresponding words
        System.out.println("All Letters and Words:");
        dictionary.printDictionary();
        System.out.println();

        // Print words of a given letter
        char letterToPrint = 'a';
        System.out.println("Words for Letter " + letterToPrint + ":");
        dictionary.printWordsOfGivenLetter(letterToPrint);

        // Remove a word
        String wordToRemove = "avocado";
        System.out.println("Removing word: " + wordToRemove);
        dictionary.removeWord(wordToRemove);


        // Print all letters and corresponding words after removal
        System.out.println("\nAll Letters and Words after removal:");
        dictionary.printDictionary();

        String wordToSearch = "apple";
        System.out.println("The found words are: " + wordToRemove);
        dictionary.wordSearch(wordToSearch);

        char wordsOfLetterToRemove = 'k';
        dictionary.removeAllKey(wordsOfLetterToRemove);

    }
}
