import java.util.*;

public class myWordsDictionary {
    private Map<Character, SortedSet<String>> wordsMap;

    public myWordsDictionary() {
        wordsMap = new TreeMap<>();
        // Initialize entries for all 26 alphabets
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            wordsMap.put(letter, new TreeSet<>());
        }
    }

    public void insertWord (String[] words) {
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                wordsMap.get(firstLetter).add(word);
            }
        }
    }

    public void printDictionary () {
        wordsMap.forEach((letter, words) -> {
            System.out.println("Letter: " + letter);
            System.out.println("Words: " + String.join(", ", words));
            System.out.println("--------------------");
        });
    }

    public void printWordsOfGivenLetter(char letter) {
        letter = Character.toUpperCase(letter);
        SortedSet<String> words = wordsMap.get(letter);

        if (words != null) {
            System.out.println("Words for letter " + letter + ": " + String.join(", ", words));
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }

    public void removeWord(String word){
        char letter=Character.toUpperCase(word.charAt(0));
        SortedSet<String> wordsSet =wordsMap.get(letter);

        // Check if the set exists and contains the word
        if (wordsSet != null && wordsSet.contains(word)) {
            wordsSet.remove(word);
            System.out.println("Word '" + word + "' removed successfully.");
        } else {
            // Throw an exception if the word doesn't exist
            throw new IllegalArgumentException("Word '" + word + "' not found in the dictionary.");
        }
    }
    public void removeAllKey(char ch) {
        SortedSet<String> wordsSet = wordsMap.get(ch);

        // Check if the set exists
        if (wordsSet != null) {
            // Clear the set
            wordsSet.clear();
            System.out.println("All words for letter '" + ch + "' removed successfully.");
        } else {
            // Handle the case where the set for the specified letter doesn't exist
            System.out.println("No words found for letter '" + ch + "'.");
        }
    }

    public void wordSearch(String searchString) {
        System.out.println("Matching words:");

        char letter = Character.toUpperCase(searchString.charAt(0));
        SortedSet<String> wordsSet = wordsMap.get(letter);

        if (wordsSet != null) {
            for (String word : wordsSet) {
                if (word.toLowerCase().contains(searchString.toLowerCase())) {
                    System.out.println(word);
                }
            }
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }
}
