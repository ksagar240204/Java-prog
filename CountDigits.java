import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int count = countDigits(number);

        System.out.println("Number of digits: " + count);
    }

    static int countDigits(long num) 
	{
        return Long.toString(num).length();
    	}
}
