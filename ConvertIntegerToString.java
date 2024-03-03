import java.util.Scanner;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String strNumber = Integer.toString(number);
        System.out.println("Converted string: " + strNumber);

        scanner.close();
    }
}
