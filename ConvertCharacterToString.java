import java.util.Scanner;

public class ConvertCharacterToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        String strCharacter = convertCharacterToString(character);
        System.out.println("Converted string: " + strCharacter);

        scanner.close();
    }

    // Function to convert a character to a string
    public static String convertCharacterToString(char c) {
        return String.valueOf(c);
    }
}
