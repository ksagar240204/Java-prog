import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range of numbers: ");
        int n = scanner.nextInt();

        // Print odd numbers and count
        System.out.println("Odd numbers within the range:");
        int count = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println("\nCount of odd numbers: " + count);

        scanner.close();
    }
}
