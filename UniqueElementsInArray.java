import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.print("Unique elements in the array: ");
        for (int i = 0; i < size; i++) {
            while (i < size - 1 && array[i] == array[i + 1]) {
                i++;
            }
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
