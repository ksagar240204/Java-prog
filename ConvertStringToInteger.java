import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String strNumber = scanner.nextLine();

        try {
            int number = Integer.parseInt(strNumber);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}
