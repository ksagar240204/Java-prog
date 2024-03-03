public class AsciiValueOfNumbers {
    public static void main(String[] args) {
        System.out.println("ASCII values of all numbers:");
        for (char c = '0'; c <= '9'; c++) {
            System.out.println(c + ": " + (int) c);
        }
    }
}
