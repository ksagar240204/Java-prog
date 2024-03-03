import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int sentenceCount = countSentences(input);
        int wordCount = countWords(input);
        int charCount = countCharacters(input);

        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);

        scanner.close();
    }

    // Function to count the number of sentences in a string
    public static int countSentences(String str) {
        String[] sentences = str.split("[.!?]");
        return sentences.length;
    }

    // Function to count the number of words in a string
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    // Function to count the number of characters in a string
    public static int countCharacters(String str) {
        return str.length();
    }
}
