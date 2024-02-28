import java.util.Scanner;
public class Multitable 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Multiplication table " + a + ":");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}