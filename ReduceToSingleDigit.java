import java.util.Scanner;

public class ReduceToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = reduceToSingleDigit(number);
        System.out.println("The result after reducing to a single digit: " + result);

        scanner.close();
    }

    // Function to reduce a number to a single digit by subtracting adjacent digits repeatedly
    public static int reduceToSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
