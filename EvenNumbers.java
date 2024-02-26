import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range of numbers: ");
        int n = scanner.nextInt();

        // Print even numbers and count
        System.out.println("Even numbers within the range:");
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println("\nCount of even numbers: " + count);

        scanner.close();
    }
}
