public class PrintAsciiValueOfSpecialCharacters {
    public static void main(String[] args) {
        System.out.println("ASCII values of special characters:");
        for (char c = 0; c <= 127; c++) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println(c + ": " + (int) c);
            }
        }
    }
}
