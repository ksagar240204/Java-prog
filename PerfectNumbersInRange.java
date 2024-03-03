import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Perfect numbers between " + start + " and " + end + " are:");
        printPerfectNumbersInRange(start, end);

        scanner.close();
    }

  
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1; // Initialize sum with 1 (as 1 is always a divisor)

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

   
    public static void printPerfectNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
