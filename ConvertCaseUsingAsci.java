import java.util.Scanner;

public class ConvertCaseUsingAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCaseUsingAscii(input);
        System.out.println("Converted string: " + convertedString);

        scanner.close();
    }

    // Function to convert upper case to lower case and vice-versa using ASCII values
    public static String convertCaseUsingAscii(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) (c + 32)); // Convert upper case to lower case
            } else if (Character.isLowerCase(c)) {
                result.append((char) (c - 32)); // Convert lower case to upper case
            } else {
                result.append(c); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }
}
