import java.util.Scanner;

public class ConvertStringToCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] charArray = convertStringToCharacters(input);
        System.out.print("Converted characters: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        scanner.close();
    }

    // Function to convert a string to an array of characters
    public static char[] convertStringToCharacters(String str) {
        return str.toCharArray();
    }
}
