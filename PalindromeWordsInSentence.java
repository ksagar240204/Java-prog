import java.util.Scanner;

public class PalindromeWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Palindrome words in the sentence are:");
        printPalindromeWords(sentence);

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void printPalindromeWords(String sentence) {
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}
